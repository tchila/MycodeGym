package fr.codegym.task.task20.task2002;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Lecture et écriture dans un fichier : CodeGym
*/
public class Solution {
    public static void main(String[] args) {
        // Tu trouveras ton_nom_de_fichier.tmp dans ton répertoire TMP, ou tu peux régler outputStream/inputStream conformément à l'emplacement de ton fichier
        try {
            File yourFile = File.createTempFile("ton_nom_de_fichier", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);



            User user1 = new User();
            user1.setFirstName("fsdf");
            user1.setLastName("fsdf");
            user1.setBirthDate(simpleDateFormat.parse("5 31 2018"));
            user1.setMale(Boolean.parseBoolean("true"));

                user1.setCountry(User.Country.UNITED_STATES);
             List<User> users = new ArrayList<>();
            users.add(user1);
            CodeGym codeGym = new CodeGym(users);
            // Initialiser le champ users pour l'objet codeGym ici
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Ici, vérifie que l'objet codeGym est égal à l'objet loadedObject

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oups, quelque chose ne va pas avec mon fichier");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oups, quelque chose ne va pas avec la méthode save/load");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public CodeGym() {
        }

        public CodeGym(List<User> users) {
            this.users = users;
        }

        public void save(OutputStream outputStream) throws Exception {
            // Implémente cette méthode
            PrintWriter printWriter = new PrintWriter(outputStream);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy'T'HH:mm:ss.SSSSSS", Locale.ENGLISH);


            for (User current : this.users) {
                printWriter.print(current.getFirstName()+",");
                printWriter.print(current.getLastName()+",");
                printWriter.print(simpleDateFormat.format(current.getBirthDate())+",");
                printWriter.print(current.isMale()+",");
                printWriter.println(current.getCountry());
                printWriter.flush();
            }

            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implémente cette méthode
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy'T'HH:mm:ss.SSSSSS", Locale.ENGLISH);
            String user;
            while ((user = reader.readLine()) != null){
                User user1 = new User();
                String[] properties = user.split(",");
                user1.setFirstName(properties[0]);
                user1.setLastName(properties[1]);
                user1.setBirthDate(simpleDateFormat.parse(properties[2].trim()));
                user1.setMale(Boolean.parseBoolean(properties[3]));
                if(properties[4].equals("UNITED_STATES")){
                    user1.setCountry(User.Country.UNITED_STATES);
                }else if(properties[4].equals("UNITED_KINGDOM")){
                    user1.setCountry(User.Country.UNITED_KINGDOM);
                }else{
                    user1.setCountry(User.Country.OTHER);
                }
                System.out.println(user1);
                this.users.add(user1);

            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

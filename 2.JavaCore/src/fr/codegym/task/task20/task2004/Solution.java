package fr.codegym.task.task20.task2004;

import java.io.*;

/* 
Lecture et écriture de champs statiques dans un fichier
*/
public class Solution {
    public static void main(String[] args) {
        // Tu trouveras ton_nom_de_fichier.tmp dans ton répertoire TMP, ou tu peux régler outputStream/inputStream conformément à l'emplacement de ton fichier
        try {

            File yourFile = File.createTempFile("ton_nom_de_fichier", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            // Ici, vérifie que l'objet classWithStatic est égal à l'objet loadedObject
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

    public static class ClassWithStatic {
        public static String staticString = "Ceci est une chaîne de test statique";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            // Implémente cette méthode
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write(staticString);
            writer.newLine();
            writer.write(i+"");
            writer.newLine();
            writer.write(j+"");
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implémente cette méthode
            BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(inputStream));
            staticString = bufferedReader.readLine();
            i = Integer.parseInt(bufferedReader.readLine());
            j = Integer.parseInt(bufferedReader.readLine());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}

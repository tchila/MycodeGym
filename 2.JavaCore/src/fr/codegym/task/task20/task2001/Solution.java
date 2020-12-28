package fr.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Lecture et écriture dans un fichier : Human
*/
public class Solution {
    public static void main(String[] args) {
        // Mettre à jour la chaîne passée à la méthode createTempFile en fonction du chemin d'accès d'un fichier sur ton disque dur
        try {
            File yourFile = File.createTempFile("ton_nom_de_fichier", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human("Smith", new Asset("maison", 999_999.99), new Asset("voiture", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            // Vérifie que smith est égal à somePerson

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Oups, quelque chose ne va pas avec mon fichier");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Oups, quelque chose ne va pas avec la méthode save/load");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            // Implémente cette méthode
            PrintWriter printWriter = new PrintWriter(outputStream);
            if(!name.isEmpty() ){
                printWriter.println(this.name);
                for (Asset current : this.assets){
                    printWriter.print(current.getName()+",");
                    printWriter.println(current.getPrice());
                    printWriter.flush();
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implémente cette méthode
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            String assetName;
            while ((assetName = reader.readLine()) != null)
                this.assets.add(new Asset(assetName.split(",")[0].trim(),Double.parseDouble(assetName.split(",")[1].trim())));
            reader.close();
        }
    }
}

package fr.codegym.task.task20.task2005;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* 
Choses étranges
*/

public class Solution {
    public static void main(String[] args) {
        // Mettre à jour la chaîne passée à la méthode createTempFile en fonction du chemin d'accès d'un fichier sur ton disque dur
        try {
            File yourFile = File.createTempFile("ton_nom_de_fichier", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human ("Smith", new Asset ("maison"), new Asset ("voiture"));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            // Vérifie que smith est égal à somePerson
            System.out.println(smith.equals(somePerson));
            inputStream.close();

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return false;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name == null ? human.name != null : !name.equals(human.name)) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;

        }

        /*@Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return (int) (Math.random() * 100);
        }*/

        @Override
        public int hashCode() {
            return Objects.hash(name, assets);
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            // Implémente cette méthode
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            if (this.assets.size() > 0) {
                for (Asset current : this.assets)
                    printWriter.println(current.getName());
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implémente cette méthode
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            this.name = reader.readLine();
            String assetName;
            while ((assetName = reader.readLine()) != null)
                this.assets.add(new Asset(assetName));
            reader.close();
        }
    }
}

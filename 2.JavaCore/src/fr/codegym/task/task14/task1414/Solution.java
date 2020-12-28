package fr.codegym.task.task14.task1414;

/* 
MovieFactory
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        // Lit plusieurs clés (chaînes) à partir de la console. Élément 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while (true){

            key = reader.readLine();
            Movie movie  = MovieFactory.getMovie(key);
            if (movie != null) {
                System.out.println(movie.getClass().getSimpleName());
            }

            if(!"cartoon".equals(key)   && !"thriller".equals(key) && !"soapOpera".equals(key)  )
                break;

        }

        /*
            8. Crée une variable movie dans la classe Movie, et pour chaque chaîne (clé) saisie :
            8.1. Obtient un objet en utilisant MovieFactory.getMovie et l'affecte à la variable movie.
            8.2. Affiche le résultat de l'appel à movie.getClass().getSimpleName().
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Crée un objet SoapOpera pour la clé « soapOpera »
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if ("thriller".equals(key))
                movie = new Thriller();
            else if ("cartoon".equals(key))
                    movie = new Cartoon();

                //écris ton code ici. Éléments 5, 6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static  class Cartoon  extends Movie  {
    }
    static  class Thriller  extends Movie {
    }

    // Écris tes classes ici. Élément 3
}

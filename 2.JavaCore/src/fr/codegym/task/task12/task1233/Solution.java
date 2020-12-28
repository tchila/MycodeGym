package fr.codegym.task.task12.task1233;

/* 
Les isomorphes arrivent
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Le plus petit est " + result.x);
        System.out.println("L'indice de l'élément le plus petit est " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        else {
            int i = 0, indice = 0;
            int min = array[0];
            for ( i = 1; i < array.length; i++) {
                if(min > array[i] ){
                    min = array[i];
                    indice= i;
                }

            }
            return new Pair<Integer, Integer>(min, indice);

        }

        //écris ton code ici

    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

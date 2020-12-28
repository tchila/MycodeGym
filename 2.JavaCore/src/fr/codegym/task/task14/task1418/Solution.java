package fr.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Corrige quatre erreurs
*/

public class Solution {
    public static void main(String[] args) {
        // 3
        List<Number> list = new LinkedList<>();





        // 5

    }

    static void initList(List<Number> list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }
    static void printListValues (List<Number> list){
// 4 - Corrige 2 bogues
        for (Number number : list) {
            System.out.println(number);
        }
    }
    static void processCastObjects(List<Number> list){
        for (Number object : list) {
            // Corrige 2 bogues
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Le float est-il défini ? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Le double est-il infini ? " + a.isInfinite());
            }
        }
    }
}

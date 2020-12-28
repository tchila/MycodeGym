package fr.codegym.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Temps dans le jardin
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();

        public synchronized void addFruit(int index, String fruit){

            fruits.add(index,fruit);
        }

        public synchronized void removeFruit(int index){
            fruits.remove(index);
        }
        public synchronized void addVegetable(int index, String fruit){
            vegetables.add(index,fruit);
        }

        public synchronized void removeVegetable(int index){
            vegetables.remove(index);
        }

    }
}

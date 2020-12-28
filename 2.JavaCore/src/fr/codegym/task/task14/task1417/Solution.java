package fr.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Devises
*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " a une réserve de " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>(){{add(new Euro(15));add(new USD(96));add(new Ruble(97));}};
            //écris ton code ici
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

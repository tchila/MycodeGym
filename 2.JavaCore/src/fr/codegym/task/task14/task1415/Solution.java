package fr.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Services d'entretien
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Écris ton implémentation des éléments 1 à 4 ici
        for (Apartment apartment : apartments) {
            if(apartment instanceof OneRoomApt )
                ((OneRoomApt) apartment).clean1Room();
            else if(apartment instanceof TwoRoomApt )
                ((TwoRoomApt) apartment).clean2Rooms();
            else if(apartment instanceof ThreeRoomApt )
                ((ThreeRoomApt) apartment).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 chambre a été nettoyée");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 chambres ont été nettoyées");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 chambres ont été nettoyées");
        }
    }
}

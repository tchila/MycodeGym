package fr.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Renforcement de l'adaptateur
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    public static void main(String[] args) {

    }

    public static class DataAdapter {
        public DataAdapter(Customer customer, Contact contact) {
        }
    }

    public static interface RowItem {
        String getCountryCode();        // Par exemple : US
        String getCompany();            // Par exemple : CodeGym Ltd.
        String getContactFirstName();   // Par exemple : John
        String getContactLastName();    // Par exemple : Peterson
        String getDialString();         // Par exemple : callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // Par exemple : CodeGym Ltd.
        String getCountryName();        // Par exemple : Etats-Unis
    }

    public static interface Contact {
        String getName();               // Par exemple : Peterson, John
        String getPhoneNumber();        // Par exemple : +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}
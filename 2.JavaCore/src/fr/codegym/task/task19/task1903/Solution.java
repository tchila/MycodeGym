package fr.codegym.task.task19.task1903;

/* 
Adaptation de plusieurs interfaces
*/


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("US", "United States");
        countries.put("UA", "Ukraine");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }


        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNum = String.valueOf(data.getPhoneNumber());
            int dif = 10 - phoneNum.length();
            while (dif > 0){
                phoneNum = 0+phoneNum;
                dif--;
            }
            return "+"+data.getCountryPhoneCode()+"("+phoneNum.substring(0,3)+")"+phoneNum.substring(3,6)+"-"+phoneNum.substring(6,8)+"-"+phoneNum.substring(8);
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // Par exemple : US

        String getCompany();            // Par exemple : CodeGym Ltd.

        String getContactFirstName();   // Par exemple : John

        String getContactLastName();    // Par exemple : Smith

        int getCountryPhoneCode();      // Par exemple : 1

        int getPhoneNumber();           // Par exemple : 991234567
    }

    public static interface Customer {
        String getCompanyName();        // Par exemple : CodeGym Ltd.

        String getCountryName();        // Par exemple : Etats-Unis
    }

    public static interface Contact {
        String getName();               // Par exemple : Smith, John

        String getPhoneNumber();        // Par exemple : +1(099)123-45-67
    }
}
package com.codegym.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ancient Rome

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman numeral to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result: " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            // Getting value of symbol s[i]
            int s1 = charToInt(s.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < s.length()) {
                int s2 = charToInt(s.charAt(i + 1));

                // Comparing both values
                if (s1 >= s2) {
                    // Value of current symbol
                    // is greater or equalto
                    // the next symbol
                    res = res + s1;
                }
                else {
                    // Value of current symbol is
                    // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
                i++;
            }
        }

        return res;
    }

    public static int charToInt(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}

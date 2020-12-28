package fr.codegym.task.task09.task0914;

/* 
Capturer un groupe d'exceptions
*/

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        try {
            methode1();
        }catch (Exception e){
        }


        //écris ton code ici

    }

    public static void methode1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}

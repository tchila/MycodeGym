package fr.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Des exceptions. Rien que des exceptions.
*/

public class Solution {
    public static void main(String[] args) throws ArithmeticException, URISyntaxException{
        //écris ton code ici
        try {
            methode1();
        }catch (NullPointerException e){
        }catch (FileNotFoundException e){
        }


        //écris ton code ici
    }

    public static void methode1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}

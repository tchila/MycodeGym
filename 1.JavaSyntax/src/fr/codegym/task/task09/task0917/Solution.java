package fr.codegym.task.task09.task0917;

/* 
Capturer des exceptions non vérifiées
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        gererExceptions(new Solution());
    }

    public static void gererExceptions(Solution obj) {
        try {
            obj.methode1();
            obj.methode2();
            obj.methode3();
        }catch (NullPointerException e){
            imprimerPile(e);
        }catch (IndexOutOfBoundsException e){
            imprimerPile(e);
        }catch (NumberFormatException e){
            imprimerPile(e);
        }
    }

    public static void imprimerPile(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void methode1() {
        throw new NullPointerException();
    }

    public void methode2() {
        throw new IndexOutOfBoundsException();
    }

    public void methode3() {
        throw new NumberFormatException();
    }
}

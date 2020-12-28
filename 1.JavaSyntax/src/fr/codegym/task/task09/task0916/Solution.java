package fr.codegym.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Capture d'exceptions vérifiées
*/

public class Solution {
    public static void main(String[] args) {
        gererExceptions(new Solution());

    }

    public static void gererExceptions(Solution obj) {

        try {
            obj.methode1();
            obj.methode2();
            obj.methode3();
        }catch (NoSuchFieldException e){
            System.out.println("NoSuchFieldException");
        }
        catch (RemoteException e){
            System.out.println("RemoteException");
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    public void methode1() throws IOException {
        throw new IOException();
    }

    public void methode2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void methode3() throws RemoteException {
        throw new RemoteException();
    }
}


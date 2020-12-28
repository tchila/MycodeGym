package com.codegym.task.task21.task2101;

/* 
Determine the network address

*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {

        byte[] bytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            bytes[i] = (byte) (ip[i] & mask[i]);
        }
        return bytes;
    }

    public static void print(byte[] bytes) {
        for (byte aByte : bytes) {
            //aByte & 0xFF) + 0x100
            //convertir l'octet en une chaine hexadecimal
            /* & 0xFF exécute un ET binaire, ce qui fait que la valeur de retour est comprise entre 0 et 255 (ce qu'un octet est toujours de toute façon)
            + 0x100 ajoute 256 au résultat pour garantir que le résultat comporte toujours 3 chiffres
            Integer.toString(src, 16) convertit l'entier en une chaîne avec l'hélice 16 (hexadécimal)
            .substring(1)Supprime enfin le premier caractère (celui 1de l'étape 2)
           */
            System.out.print(Integer.toBinaryString((aByte & 0xFF) + 0x100).substring(1) + " ");
        }
    }
}

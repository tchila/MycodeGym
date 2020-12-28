package fr.codegym.task.task18.task1826;

/* 
Chiffrement
*/

import javax.crypto.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        String fileName = args[1];
        String fileOutputName = args[2];
        FileInputStream in = new FileInputStream(fileName);
        FileOutputStream out =  new FileOutputStream(fileOutputName);

        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey myDesKey = keygenerator.generateKey();

        Cipher desCipher;
        desCipher = Cipher.getInstance("DES");
        byte[] text = new byte[in.available()];

        switch (args[0]){
            case "-e" : {
                desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
                byte[] textEncrypted = desCipher.doFinal(text);
                out.write(textEncrypted);
            }
            break;
            case "-d" : {
                desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
                byte[] textDecrypted = desCipher.doFinal(text);
                out.write(textDecrypted);
            }
            break;
            default:
                break;
        }
        in.close();
        out.close();

        }




}

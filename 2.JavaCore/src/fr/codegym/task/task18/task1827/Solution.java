package fr.codegym.task.task18.task1827;

/* 
Tarifs
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        if (args.length != 0) {
            switch (args[0]) {
                case "-c": {
                    String lastLine = "";
                    String sCurrentLine = "";
                    BufferedReader reader = new BufferedReader(new FileReader(s));
                    StringBuffer inputBuffer = new StringBuffer();
                    while ((sCurrentLine = reader.readLine()) != null) {
                        inputBuffer.append(sCurrentLine);
                        inputBuffer.append('\n');
                        lastLine = sCurrentLine;
                    }
                    reader.close();
                    String id;
                    if (!lastLine.isEmpty()) {
                        Integer lastId = Integer.parseInt(lastLine.substring(0, 8).trim());
                        id = String.valueOf(lastId + 1);
                    } else {
                        id = "1";
                    }

                    if ((8 - id.length()) > 0) {
                        int diff = 8 - id.length();
                        while (diff > 0) {
                            id += " ";
                            diff--;
                        }
                    }
                    String nomProduit = args[1];
                    if ((30 - nomProduit.length()) > 0) {
                        int diff = 30 - nomProduit.length();
                        while (diff > 0) {
                            nomProduit += " ";
                            diff--;
                        }
                    }

                    String prix = args[2];
                    if ((8 - prix.length()) > 0) {
                        int diff = 8 - prix.length();
                        while (diff > 0) {
                            prix += " ";
                            diff--;
                        }
                    }

                    String quantité = args[3];
                    if ((4 - quantité.length()) > 0) {
                        int diff = 4 - quantité.length();
                        while (diff > 0) {
                            quantité += " ";
                            diff--;
                        }
                    }
                    inputBuffer.append(id + nomProduit + prix + quantité);

                    BufferedWriter writer = new BufferedWriter(new FileWriter(s));
                    writer.write(inputBuffer.toString());
                    writer.flush();
                    writer.close();
                }
                default:
                    break;

            }
        }
    }
}

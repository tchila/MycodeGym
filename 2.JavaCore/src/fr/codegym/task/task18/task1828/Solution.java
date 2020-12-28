package fr.codegym.task.task18.task1828;

/* 
Tarifs 2
*/


import java.io.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        if (args.length != 0) {
            switch (args[0]) {
                case "-u": {
                    String newLine ="";
                    String oldLine ="";
                    String sCurrentLine = "";
                    BufferedReader reader = new BufferedReader(new FileReader(s));
                    StringBuffer inputBuffer = new StringBuffer();

                    while ((sCurrentLine = reader.readLine()) != null) {
                        inputBuffer.append(sCurrentLine);
                        inputBuffer.append('\n');
                        if (sCurrentLine.substring(0, 8).trim().equals(args[1])) {
                            oldLine = sCurrentLine;
                            String nomProduit = args[2];
                            if ((30 - nomProduit.length()) > 0) {
                                int diff = 30 - nomProduit.length();
                                while (diff > 0) {
                                    nomProduit += " ";
                                    diff--;
                                }
                            }

                            String prix = args[3];
                            if ((8 - prix.length()) > 0) {
                                int diff = 8 - prix.length();
                                while (diff > 0) {
                                    prix += " ";
                                    diff--;
                                }
                            }

                            String quantite = args[4];
                            if ((4 - quantite.length()) > 0) {
                                int diff = 4 - quantite.length();
                                while (diff > 0) {
                                    quantite += " ";
                                    diff--;
                                }
                            }

                            newLine = sCurrentLine.substring(0, 8)+ nomProduit + prix + quantite;
                        }

                    }
                    reader.close();
                    String inputStr = inputBuffer.toString().replace(oldLine,newLine);
                    BufferedWriter writer = new BufferedWriter(new FileWriter(s));
                    writer.write(inputStr);
                    writer.flush();
                    writer.close();
                    break;
                }
                case "-d": {
                    BufferedReader reader = new BufferedReader(new FileReader(s));
                    String inputBuffer;

                    inputBuffer = reader.lines().filter(sCurrentLine -> !sCurrentLine.substring(0, 8).trim().equals(args[1])).map(sCurrentLine -> sCurrentLine + '\n').collect(Collectors.joining());
                    BufferedWriter writer = new BufferedWriter(new FileWriter(s));
                    writer.write(inputBuffer);
                    writer.flush();
                    writer.close();
                    break;
                    }
                default:
                    break;

            }

        }
    }
}

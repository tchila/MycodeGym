package fr.codegym.task.task13.task1326;

/* 
Tri de nombres pairs à partir d'un fichier
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        BufferedReader bufferedReader = null;
       // BufferedReader bufferedReader1 ;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file = bufferedReader.readLine();

            List<Integer> list = new ArrayList<>();
            list = bufferedReader.lines().map(Integer::parseInt).sorted().collect(Collectors.toList());
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            list.stream().filter(integer -> (integer % 2) == 0).forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bufferedReader.close();

        }
    }
}

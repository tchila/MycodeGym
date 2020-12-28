package fr.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionnalité
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String name1 = bufferedReader.readLine();
            String name2 = bufferedReader.readLine();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(name1)));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                allLines.add(s);
            }

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(name2)));
            while ((s = bufferedReader.readLine()) != null) {
                linesForRemoval.add(s);
            }
            new Solution().joinData();
        } catch (CorruptedDataException e) {
        }catch (IOException e) {
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  synchronized void joinData() throws CorruptedDataException {
        boolean containsAll;
        containsAll = linesForRemoval.stream().allMatch(s -> allLines.contains(s));
        if(containsAll){
            allLines.removeAll(linesForRemoval);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

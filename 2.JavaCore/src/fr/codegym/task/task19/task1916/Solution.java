package fr.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Suivi des modifications
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2  = bufferedReader.readLine();

        bufferedReader.close();
        BufferedReader  reader = new BufferedReader(new FileReader(file1));
        BufferedReader  reader1 = new BufferedReader(new FileReader(file2));
        List<String> file1Line;
        List<String> file2Line;

        file1Line = reader.lines().collect(Collectors.toList());
        reader.close();

        file2Line = reader1.lines().collect(Collectors.toList());
        reader1.close();

        List<String> file1LineCopie = new ArrayList<>(file1Line);
        file1LineCopie.retainAll(file2Line);
        file1Line.removeAll(file1LineCopie);
        file2Line.removeAll(file1LineCopie);

        lines = new ArrayList<>(Stream.of(file1LineCopie, file1Line, file2Line).mapToInt(List::size).sum());
        lines.set(0,new LineItem(Type.SAME,file1LineCopie.get(0)));
        lines.set(1,new LineItem(Type.REMOVED,file1Line.get(0)));
        lines.set(3,new LineItem(Type.ADDED,file2Line.get(0)));
        //lines.set(3,new LineItem(Type.REMOVED,file1Line.get(1)));
        int j = 0;
        for (int i = 1; i < file1LineCopie.size();i++ ) {
            j+=2;
            lines.set(j,new LineItem(Type.SAME,file1LineCopie.get(i)));
        }

        if(file1Line.size() > file2Line.size()){
            int k = 3;
            for (int i = 1; i < file2Line.size();i++ ) {
                    k+=4;
                lines.set(k,new LineItem(Type.ADDED,file2Line.get(i)));
            }

            int l = 1;
            for (int i = 1; i < file1Line.size();i++ ) {
                if(i<file2Line.size())
                    l+=4;
                else
                    l+=2;
                lines.set(l,new LineItem(Type.REMOVED,file1Line.get(i)));
            }
        }else{
            int k = 3;
            for (int i = 1; i < file2Line.size();i++ ) {

                if(i<file1Line.size())
                    k+=4;
                else
                    k+=2;
                lines.set(k,new LineItem(Type.ADDED,file2Line.get(i)));
            }

            int l = 1;
            for (int i = 1; i < file1Line.size();i++ ) {
                    l+=4;
                lines.set(l,new LineItem(Type.REMOVED,file1Line.get(i)));
            }
        }



    }

    public static enum Type {
        ADDED,        // Nouvelle ligne ajoutée
        REMOVED,      // Ligne supprimée
        SAME          // Pas de changement
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

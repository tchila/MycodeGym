package fr.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //écris ton code ici
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //écris ton code ici
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //écris ton code ici

    public static class ReadFileThread extends Thread  implements  ReadFileInterface{

        private String content ="";
        private String fileName;
        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            return content;
        }


        @Override
        public void run() {
            BufferedReader reader1 = null;
            try {
                reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String s ="";
                while ((s=reader1.readLine())!=null){
                    content += " "+ s;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader1.close();
                } catch (IOException e) {

                }
            }

        }
    }
}

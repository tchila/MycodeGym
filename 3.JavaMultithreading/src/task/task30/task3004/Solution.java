package task.task30.task3004;

import com.codegym.task.task30.task3004.BinaryRepresentationTask;

import java.util.concurrent.ForkJoinPool;

/* 
Fork/Join

*/

public class Solution {
    private String convertToBinaryRepresentation(int x) {
        int a = x % 2;
        int b = x / 2;
        String result = String.valueOf(a);
        if (b > 0) {
            return convertToBinaryRepresentation(b) + result;
        }
        return result;
    }


    public static void main(String[] args) {
        com.codegym.task.task30.task3004.Solution solution = new com.codegym.task.task30.task3004.Solution();
        String result1 = solution.convertToBinaryRepresentation(6);
        System.out.println(result1);

        System.out.println();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        String result2 = forkJoinPool.invoke(new BinaryRepresentationTask(6));
        System.out.println(result2);
    }

}

package task.task23.task2307;

/* 
How do I choose the right one?

*/
public class Solution {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static Object obj ;

    public static void main(String[] args) {
        obj = Solution.TEST;
        obj = new TEST();
        System.out.println(obj);
    }
}
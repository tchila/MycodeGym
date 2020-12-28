package fr.codegym.task.task09.task0925;

/* 
Modificateurs static en désordre
*/

public class Solution {
    public  static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution salle = new Solution();
        salle.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}

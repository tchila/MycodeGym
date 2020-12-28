package task.task27.task2707;

/*
Determining locking order

*/
public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution, final Object o1, final Object o2) throws Exception {
        final String[] strings = {null};

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (o2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                solution.someMethodWithSynchronizedBlocks(o1, o2);
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                synchronized (o1) {
                        strings[0] = "o1";

                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5);

        if(strings[0] == null)
            return true;

        return false;
    }
    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}

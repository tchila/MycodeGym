package task.task25.task2510;

/* 
Wait and see

*/
public class Solution extends Thread {

    public Solution() {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
    }

    public static void main(String[] args) {
    }


    static class ExceptionHandler implements UncaughtExceptionHandler{

        public ExceptionHandler() {
        }

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            if(e instanceof Error)
                System.out.println( "Can't keep running");
            if(e instanceof Exception) {
                System.out.println("Needs handling");
            }
            if (e instanceof Throwable && !(e instanceof Error) && !(e instanceof Exception))
                System.out.println("Wait and see");
        }
    }

}

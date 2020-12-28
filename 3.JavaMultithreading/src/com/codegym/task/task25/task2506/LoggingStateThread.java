package com.codegym.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        State state = target.getState();
        System.out.println(state);
        super.run();
        while (state != State.TERMINATED) {
            State currentState = target.getState();
            if (state != currentState)
                System.out.println(currentState);
            state = currentState;
        }
    }
}

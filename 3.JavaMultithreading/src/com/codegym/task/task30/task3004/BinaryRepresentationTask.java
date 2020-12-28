package com.codegym.task.task30.task3004;

import java.util.concurrent.RecursiveTask;

public class BinaryRepresentationTask extends RecursiveTask<String> {
    private int i;
    public BinaryRepresentationTask(int i) {
        this.i = i;
    }

    @Override
    protected String compute() {
        if(i <=0){
            return String.valueOf(0);
        }else if(i ==1){
            return String.valueOf(1);
        }

        BinaryRepresentationTask b1 = new BinaryRepresentationTask(i % 2);
        b1.fork();
        BinaryRepresentationTask b2 = new BinaryRepresentationTask(i / 2);
        return b2.compute() + b1.join();

    }
}

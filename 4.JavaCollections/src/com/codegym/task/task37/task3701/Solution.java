package com.codegym.task.task37.task3701;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Circular iterator

*/

public class Solution<T> extends ArrayList<T> {
    public static void main(String[] args) {
        Solution<Integer> list = new Solution<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int count = 0;
        for (Integer i : list) {
            //1 2 3 1 2 3 1 2 3 1
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                break;
            }
        }
    }

    @Override
    public CircularIterator iterator() {
        return new CircularIterator();
    }

    public class CircularIterator implements Iterator<T>{
        Iterator<T> iterator =  Solution.super.iterator();
        int i = 0;
        @Override
        public boolean hasNext() {
            if (size() == 0)
                return false;
            if(i >= size()){
                iterator = Solution.super.iterator();
                i = 0;
            }
            return true;
        }

        @Override
        public void remove() {
            iterator.remove();
        }

        @Override
        public T next() {
            i++;
            return iterator.next();
        }
    }
}

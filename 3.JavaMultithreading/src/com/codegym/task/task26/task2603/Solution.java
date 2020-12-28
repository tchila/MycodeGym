package com.codegym.task.task26.task2603;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
A convert can easily convert others

*/
public class Solution {
    public Solution() {
    }

    public static  class CustomizedComparator<T> implements Comparator<T> {

        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            int compare = 0;

            for (Comparator<T> comparator : comparators) {
                compare = comparator.compare(o1, o2);
                if(compare!=0)
                    return compare;
            }
            return compare;
        }
    }

    public static void main(String[] args) {

    }
}

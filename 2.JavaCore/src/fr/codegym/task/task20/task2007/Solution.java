package fr.codegym.task.task20.task2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* 
Comment sérialiser CodeGym ?
*/
public class Solution {
    public static class CodeGym implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task33.task3310;

import com.codegym.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.codegym.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(),10000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> ids = new HashSet<>();
        for (String string : strings) {
            Long  id = null;
            if((id =shortener.getId(string))!=null)
                ids.add(id);
        }
        return ids;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> strings = new HashSet<>();
        for (Long key : keys) {
            String  s = null;
            if((s =shortener.getString(key))!=null)
                strings.add(s);
        }
        return strings;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Set<String> strings = new HashSet<>();
        Helper.printMessage(strategy.getClass().getSimpleName());
        for (int i = 0; i < elementsNumber; i++) {
            strings.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);
        long startTime = new Date().getTime();
        Set<Long> ids = getIds(shortener, strings);
        long stopTime = new Date().getTime();
        System.out.println(stopTime - startTime);

        long startTime1 = new Date().getTime();
        Set<String> strings1 = getStrings(shortener, ids);
        long stopTime1 = new Date().getTime();
        System.out.println(stopTime1 - startTime1);
        if(strings.equals(strings1)){
            Helper.printMessage("The test passed.");
        }else Helper.printMessage("The test failed.");
    }
}

package com.codegym.task.task34.task3413;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SoftCache {
    private Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.get(key);

        if(softReference != null){
            return softReference.get();
        }
        //write your code here
        return null;
    }

    public AnyObject put(Long key, AnyObject value) {
        SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));
        if (softReference!=null){
            AnyObject object = softReference.get();
            softReference.clear();
            return object;

        }
        //write your code here
        return null;
    }

    public AnyObject remove(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.remove(key);

        //write your code here
        if (softReference!=null){
            AnyObject object = softReference.get();
            softReference.clear();
            return object;

        }
        //write your code here
        return null;
    }
}
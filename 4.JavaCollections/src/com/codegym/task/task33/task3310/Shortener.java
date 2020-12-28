package com.codegym.task.task33.task3310;

import com.codegym.task.task33.task3310.strategy.StorageStrategy;

public class Shortener {
    private Long lastId = Long.valueOf(0);
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public synchronized Long getId(String string){
        if(storageStrategy.containsValue(string))
            return storageStrategy.getKey(string);
        else {
            storageStrategy.put(++lastId,string);
        }
        return lastId;
       /* char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        long id = 0; // initialize result

        // A simple base conversion logic
        for (int i = 0; i < string.length(); i++)
        {
            if ('a' <= string.charAt(i) &&
                    string.charAt(i) <= 'z')
                id = id * 62 + string.charAt(i) - 'a';
            if ('A' <= string.charAt(i) &&
                    string.charAt(i) <= 'Z')
                id = id * 62 + string.charAt(i) - 'A' + 26;
            if ('0' <= string.charAt(i) &&
                    string.charAt(i) <= '9')
                id = id * 62 + string.charAt(i) - '0' + 52;
        }
        return id;*/
    }

    public String getString(Long id){
        return storageStrategy.getValue(id);
        /*char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuffer shorturl = new StringBuffer();

        // Convert given integer id to a base 62 number
        while (id > 0)
        {
            // use above map to store actual character
            // in short url
            shorturl.append(map[(int) (id % 62)]);
            id = id / 62;
        }

        // Reverse shortURL to complete base conversion
        return shorturl.reverse().toString();*/
    }
}

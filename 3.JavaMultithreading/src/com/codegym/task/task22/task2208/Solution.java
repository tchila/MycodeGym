package com.codegym.task.task22.task2208;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

/* 
Build a WHERE query

*/
public class Solution {
    public static void main(String[] args) {
            Map<String, String> map = new HashMap();
            map.put("a","b");
            map.put("c",null);
            map.put("e","f");

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        if(params==null)
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fm = new Formatter(stringBuilder);
        //int i = 1;
        for (Map.Entry<String, String> param : params.entrySet()) {
            if(!(param.getValue()==null)){

                fm.format("%s = %s%s",param.getKey(),"'"+param.getValue()+"'"," and ");


            }
        }
        if (stringBuilder.toString().trim().length()>0)
            return stringBuilder.toString().substring(0,stringBuilder.toString().lastIndexOf("and")).trim();
        else return "";
    }
}

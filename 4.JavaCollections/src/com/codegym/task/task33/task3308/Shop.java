package com.codegym.task.task33.task3308;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(name = "shop")
public class Shop {
    public int count ;
    public double profit;
    public Goods goods;
    public  String[] secretData ;
    static class Goods{
        public List<String> names;
    }
}

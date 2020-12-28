package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.ad.Advertisement;
import com.codegym.task.task27.task2712.ad.StatisticsAdvertisementManager;
import com.codegym.task.task27.task2712.statistics.StatisticsManager;
import com.codegym.task.task27.task2712.statistics.event.OrderReadyEventDataRow;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ManagerTablet {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    DecimalFormat df = new DecimalFormat("#.00");

    public void printAdRevenue() {
        double total = 0.00;
        TreeMap<Date, Long> treeMap = StatisticsManager.getInstance().getAdvertisementProfit();
        for (Date date: treeMap.keySet()) { // проходим по дате отсортированную treeMap
            double count = 0.00;
            count = (double) treeMap.get(date)/100;
            ConsoleHelper.writeMessage(sdf.format(date) + " - " + df.format(count).replace(",", ".")); // выводим 2 знака после запятой
            total += count;
        }
        ConsoleHelper.writeMessage("Total - " + df.format(total).replace(",","."));
    }
    public void printCookUtilization() {
        TreeMap<Date,TreeMap<String, Integer>> treeMap = StatisticsManager.getInstance().CookWorkloading();
        for (Map.Entry<Date, TreeMap<String, Integer>> entry: treeMap.entrySet()){
            ConsoleHelper.writeMessage(sdf.format(entry.getKey()));
            for (Map.Entry<String, Integer> entry1: entry.getValue().entrySet()){
                ConsoleHelper.writeMessage(entry1.getKey() + " - " + (int)Math.ceil(((double)entry1.getValue())/60) + " min"); //(int)Math.ceil(((double)orderTime)/60) округление в минутах
            }
            ConsoleHelper.writeMessage("");
        }

    }
    public void  printActiveVideoSet(){
        List<Advertisement> copie = new ArrayList<>(StatisticsAdvertisementManager.getInstance().getActiveAdvertisment());
        Collections.sort(copie, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        for (Advertisement advertisement : copie) {
            System.out.println(advertisement.getName() + " - " +advertisement.getImpressionsRemaining());
        }
    }
    public void printArchivedVideoSet(){
        List<Advertisement> copie = new ArrayList<>(StatisticsAdvertisementManager.getInstance().getInActiveAdvertisment());
        Collections.sort(copie, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        for (Advertisement advertisement : copie) {
            System.out.println(advertisement.getName() );
        }
    }
}

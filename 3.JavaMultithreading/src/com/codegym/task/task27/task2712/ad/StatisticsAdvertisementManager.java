package com.codegym.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class StatisticsAdvertisementManager {
    private static StatisticsAdvertisementManager instance = new StatisticsAdvertisementManager();
    private AdvertisementStorage advertisementStorage =  AdvertisementStorage.getInstance();

    private StatisticsAdvertisementManager() {

    }

    public static StatisticsAdvertisementManager getInstance(){
        return instance;
    }

    public  List<Advertisement>  getActiveAdvertisment(){
        return advertisementStorage.listToDisplay();
    }

    public  List<Advertisement>  getInActiveAdvertisment(){
        List<Advertisement> l = new ArrayList<Advertisement>();
        for (Advertisement a : advertisementStorage.list()) {
            if (a.getImpressionsRemaining() == 0) {
                l.add(a);
            }
        }
        return l;
    }
}

package com.codegym.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
        private final List<Advertisement> videos = new ArrayList<>();
    private static AdvertisementStorage instance = null ;
    private AdvertisementStorage() {
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); // 15 min
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60)); // 10 min
    }

    public List<Advertisement> listToDisplay() {
        List<Advertisement> l = new ArrayList<Advertisement>();
        for (Advertisement a : videos) {
            if (a.getImpressionsRemaining() > 0) {
                l.add(a);
            }
        }
        return l;
    }
    public static AdvertisementStorage getInstance() {
        if(instance == null){		//если объект еще не создан
            instance = new AdvertisementStorage();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }

    public List<Advertisement> list(){
        return videos;
    }

    public void add(Advertisement advertisement){
        videos.add(advertisement);
    }
}

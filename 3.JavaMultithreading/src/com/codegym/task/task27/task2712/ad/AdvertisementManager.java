package com.codegym.task.task27.task2712.ad;

import com.codegym.task.task27.task2712.ConsoleHelper;
import com.codegym.task.task27.task2712.statistics.StatisticsManager;
import com.codegym.task.task27.task2712.statistics.event.VideosSelectedEventDataRow;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;
    private List<Advertisement> playList = new ArrayList<>();


    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException {
        if (storage.list().isEmpty()) throw new NoVideoAvailableException();
        List<Advertisement> remainingList = new ArrayList<>(storage.listToDisplay());
        getOptimalPlaylist(remainingList, new ArrayList<>(), timeSeconds);
        if (playList.isEmpty()) throw new NoVideoAvailableException();
        Collections.sort(playList, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                if (o2.getAmountPerImpression() > o1.getAmountPerImpression()) return 1;
                else if (o2.getAmountPerImpression() == o2.getAmountPerImpression()) {
                    long ApIpSecondObj1 = o1.getAmountPerImpression() / o1.getDuration();
                    long ApIpSecondObj2 = o2.getAmountPerImpression() / o2.getDuration();
                    return (int) (ApIpSecondObj1 - ApIpSecondObj2);
                }
                return -1;
            }
        });
        long amount=0;
        int duration=0;
        for(Advertisement a:playList)amount+=a.getAmountPerImpression();
        for(Advertisement a:playList)duration+=a.getDuration();
        StatisticsManager.getInstance().record(new VideosSelectedEventDataRow(playList,amount,duration));
        playList.forEach(Advertisement::revalidate);
        playList.forEach(video -> ConsoleHelper.writeMessage("Displaying " + video.getName() + "... " + video.getAmountPerImpression() + ", " + (1000L * video.getAmountPerImpression() / video.getDuration())));
    }

    public void getOptimalPlaylist(List<Advertisement> remainingVideos, List<Advertisement> selectedVideos, int remainingTime) {
        List<Advertisement> newRemainingVideos = new ArrayList<>(remainingVideos);
        List<Advertisement> newSelectedVideos = new ArrayList<>(selectedVideos);
        newRemainingVideos.sort((o1, o2) -> (int) (o2.getAmountPerImpression() - o1.getAmountPerImpression()));
        if (newRemainingVideos.isEmpty()) {
            if (playList.isEmpty())
                playList = newSelectedVideos;
            else {
                long playListAmount = 0;
                int playListTotalTime = 0;
                for (Advertisement ad : playList) {
                    playListAmount += ad.getAmountPerImpression();
                    playListTotalTime += ad.getDuration();
                }
                long newSelectedVideosAmount = 0;
                int newSelectedVideosTotalTime = 0;
                for (Advertisement ad : newSelectedVideos) {
                    newSelectedVideosAmount += ad.getAmountPerImpression();
                    newSelectedVideosTotalTime += ad.getDuration();
                }
                if (playListAmount == newSelectedVideosAmount && playListTotalTime == newSelectedVideosTotalTime) {
                    if (playList.size() > newSelectedVideos.size()) playList = newSelectedVideos;
                } else if (playListAmount == newSelectedVideosAmount) {
                    if (playListTotalTime < newSelectedVideosTotalTime) playList = newSelectedVideos;
                }
            }
        } else {
            Advertisement video = newRemainingVideos.remove(0);
            if (video.getDuration() <= remainingTime && video.getImpressionsRemaining() >0) {
                newSelectedVideos.add(video);
                getOptimalPlaylist(newRemainingVideos, newSelectedVideos, remainingTime - video.getDuration());
            } else getOptimalPlaylist(newRemainingVideos, newSelectedVideos, remainingTime);
        }
    }
}


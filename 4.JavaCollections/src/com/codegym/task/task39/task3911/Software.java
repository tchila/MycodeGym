package com.codegym.task.task39.task3911;

import java.util.*;

public class Software {
    int currentVersion;

    private Map<Integer, String> versionHistoryMap = new LinkedHashMap<>();

    public void addNewVersion(int version, String description) {
        if (version > currentVersion) {
            versionHistoryMap.put(version, description);
            currentVersion = version;
        }
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public Map<Integer, String> getVersionHistoryMap() {
        return Collections.unmodifiableMap(versionHistoryMap);
    }

    public boolean rollback(int rollbackVersion) {
         if(versionHistoryMap.get(rollbackVersion)== null)
             return false;
        currentVersion = rollbackVersion;
        Iterator<Integer> iterator = versionHistoryMap.keySet().iterator();
        List<Integer> removalVersions = new ArrayList<>();
        while (iterator.next()!= rollbackVersion);
        while (iterator.hasNext()){
            removalVersions.add(iterator.next());
        }
        for (Integer i : removalVersions) {
            versionHistoryMap.remove(i);
        }
        return true;
    }
}

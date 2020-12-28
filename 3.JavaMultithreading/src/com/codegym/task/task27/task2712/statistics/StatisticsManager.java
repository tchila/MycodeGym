package com.codegym.task.task27.task2712.statistics;

import com.codegym.task.task27.task2712.kitchen.Cook;
import com.codegym.task.task27.task2712.statistics.event.EventDataRow;
import com.codegym.task.task27.task2712.statistics.event.EventType;
import com.codegym.task.task27.task2712.statistics.event.OrderReadyEventDataRow;
import com.codegym.task.task27.task2712.statistics.event.VideosSelectedEventDataRow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StatisticsManager {
    private static StatisticsManager instance = null;
    private  StatisticsStorage statisticsStorage = new StatisticsStorage();
    //private Set<Cook> cooks = new HashSet();


    private StatisticsManager() {
    }

    public static StatisticsManager getInstance() {

        if(instance == null)
            instance = new StatisticsManager();
        return instance;
    }

    public void record(EventDataRow data){
        statisticsStorage.put(data);

    }

    private class StatisticsStorage {
        private Map<EventType, List<EventDataRow>> storage  = new HashMap<>();

        public StatisticsStorage() {
            for (EventType eventType : EventType.values()){
                storage.put(eventType, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data){
            storage.get(data.getType()).add(data);
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }

    }
   /* public void register(Cook cook){
        cooks.add(cook);
    }*/

    public TreeMap<Date, Long> getAdvertisementProfit(){
        List<EventDataRow> listsVideoEvent  = statisticsStorage.getStorage().get(EventType.VIDEOS_SELECTED); // список событий по показу рекламы.
        Set<Date> dateSet = new HashSet<>(); // создаем Set для формирования списка дат
        SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH); //для преобразования даты, чтобы по ней фильтровать суммы за день
        // проходим по списку событий чтобы получить даты
        for (EventDataRow edr :listsVideoEvent){
            dateSet.add(getParse(sdf, edr)); // этим способом мы убираем минуты и оставляем только дату
        }
        //создаем TreeMap где key - дата, а value - сумма стоимости всех показов рекламы в этот день.
        TreeMap<Date, Long> mapVideo = new TreeMap<>(Comparator.reverseOrder()); // сортируем по убыванию
        for (Date date: dateSet){
            long amountSum = 0;
            for (EventDataRow edr :listsVideoEvent){
                VideosSelectedEventDataRow videoSelectedEventDataRow = (VideosSelectedEventDataRow) edr; // приводим событие к видео
                if(getParse(sdf, edr).equals(date)) amountSum+=videoSelectedEventDataRow.getAmount();
            }
            mapVideo.put(date,amountSum);

        }
        return mapVideo;
    }

    // метод, который из хранилища достанет все данные, относящиеся к работе повара,
    // и посчитает общую продолжительность работы для каждого повара отдельно.
    public TreeMap<Date,TreeMap<String, Integer>> CookWorkloading(){
        List<EventDataRow> listsCookEvent  = statisticsStorage.getStorage().get(EventType.ORDER_READY); // список событий по работе поваров
        Set<Date> dateSet = new HashSet<>(); // создаем Set для формирования списка дат
        Set<String> cooks = new HashSet<>(); // создаем Set из имен поваров.
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH); //для преобразования даты, чтобы по ней фильтровать суммы за день
        // проходим по списку событий чтобы получить даты
        for (EventDataRow edr :listsCookEvent){
            dateSet.add(getParse(sdf, edr)); // этим способом мы убираем минуты и оставляем только дату
            cooks.add(((OrderReadyEventDataRow)edr).getCookName()); // заполняем список именами поваров
        }
        //создаем TreeMap где key - дата, а value - сумма стоимости всех показов рекламы в этот день.
        TreeMap<Date,TreeMap<String, Integer>> mapCooks = new TreeMap<>(Comparator.reverseOrder()); // сортируем по убыванию
        for (Date date: dateSet){
            ArrayList<OrderReadyEventDataRow> listTemp = new ArrayList<>();// список событий order для каждого дня

            TreeMap<String,Integer> mapCookTime = new TreeMap<>(); //список поваров и времени рааботы каждого в этот день

            for (EventDataRow edr :listsCookEvent) {
                if (getParse(sdf, edr).equals(date)) {               // формирум для каждой даты список событий и заполняем его.
                    OrderReadyEventDataRow cookedOrderEventDataRow = (OrderReadyEventDataRow) edr; // приводим событие к заказу повару
                    listTemp.add(cookedOrderEventDataRow);
                }
            }
            // проходим по полученному списку собый списком поваров и получаем итоговое время для каждого повара


            for (String cook : cooks) {
                int orderTime = 0;
                for (OrderReadyEventDataRow event : listTemp) {
                    if (cook.equals(event.getCookName()))
                        orderTime += event.getTime();
                }

                mapCookTime.put(cook, orderTime);
            }
            mapCooks.put(date,mapCookTime);
        }

        return mapCooks;
    }
    private Date getParse(SimpleDateFormat sdf, EventDataRow edr) {
        Date date = null;
        try {
            date = sdf.parse(sdf.format(edr.getDate()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

   /* public Set<Cook> getCooks() {
        return cooks;
    }

    public void setCooks(Set<Cook> cooks) {
        this.cooks = cooks;
    }*/
}

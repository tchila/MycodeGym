package com.codegym.task.task39.task3913;

import com.codegym.task.task39.task3913.query.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser implements IPQuery, UserQuery, DateQuery, EventQuery, QLQuery {
    private Path logDir;
    public LogParser(Path logDir) {
        this.logDir = logDir;
    }
    private Set<String> getIpSet(Object recordField, Date after, Date before) {
        Set<String> ipSet = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            if (isDateInside(after, before, record.getDate()) && isFieldMatch(recordField, record)) {
                ipSet.add(record.getIp());
            }
        }
        return ipSet;
    }

    private boolean isFieldMatch(Object recordField, LogRecord record) {
        boolean criteria = false;
        if (recordField == null)
            return true;
        if (recordField instanceof String)
            criteria = record.getUser().equals(recordField);
        else if (recordField instanceof Event)
            criteria = record.getEvent().equals(recordField);
        else if (recordField instanceof Status)
            criteria = record.getStatus().equals(recordField);
        return criteria;
    }

    private boolean isFieldMatch(String field, String value, LogRecord record) throws ParseException {
        boolean criteria = false;
        if (field == null) return true;
        if (value == null) return false;
        switch (field) {
            case "ip": {
                criteria = record.getIp().equals(value);
                break;
            }
            case "user": {
                criteria = record.getUser().equals(value);
                break;
            }
            case "date": {
                criteria = record.getDate().equals(new SimpleDateFormat("d.M.yyyy H:m:s").parse(value));
                break;
            }
            case "event": {
                criteria = record.getEvent().equals(Event.valueOf(value));
                break;
            }
            case "status": {
                criteria = record.getStatus().equals(Status.valueOf(value));
                break;
            }
        }
        return criteria;
    }

    private boolean isDateInside(Date after, Date before, Date currentDate) {
        if (after != null) {
            if (currentDate.getTime() <= after.getTime())
                return false;
        }
        if (before != null) {
            if (currentDate.getTime() >= before.getTime())
                return false;
        }
        return true;
    }

    private List<LogRecord> getParsedRecords(Path logDir) {
        List<LogRecord> recordList = new ArrayList<>();
        try {
            for (File file : logDir.toFile().listFiles()) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".log"))
                    for (String record : Files.readAllLines(file.toPath())) {
                        recordList.add(new LogRecord(record));
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recordList;
    }
    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        return getUniqueIPs(after, before).size();
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        return getIpSet(null, after, before);
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        return getIpSet(user, after, before);
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        return getIpSet(event, after, before);
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        return getIpSet(status, after, before);
    }

    @Override
    public Set<String> getAllUsers() {
        Set<String> users = new HashSet<>();
        for (LogRecord record: getParsedRecords(logDir)){
            if (!users.contains(record.getUser())) {
                users.add(record.getUser());
            }
        }
        return users;
    }

    private Set<String> getAllUsers(String field, String value, Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            try {
                if (isDateInside(after, before, record.getDate()) && isFieldMatch(field, value, record)) {
                    users.add(record.getUser());
                }
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return users;
    }
    @Override
    public int getNumberOfUsers(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            if (isDateInside(after, before, record.getDate()) && !users.contains(record.getUser())) {
                users.add(record.getUser());
            }
        }
        return users.size();
    }

    @Override
    public int getNumberOfUserEvents(String user, Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getUser().equals(user))
                events.add(logRecord.getEvent());
        }

        return events.size();
    }

    @Override
    public Set<String> getUsersForIP(String ip, Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getIp().equals(ip))
                users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveLoggedIn(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.LOGIN))
                users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveDownloadedPlugin(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.DOWNLOAD_PLUGIN))
                users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveSentMessages(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.SEND_MESSAGE))  users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveAttemptedTasks(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.ATTEMPT_TASK))  users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveAttemptedTasks(Date after, Date before, int task) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.ATTEMPT_TASK) &&
                    logRecord.getTaskNumber() != null &&
                    !logRecord.getTaskNumber().isEmpty() &&
                    Integer.parseInt(logRecord.getTaskNumber()) == task)  users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveCompletedTasks(Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.COMPLETE_TASK))  users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<String> getUsersWhoHaveCompletedTasks(Date after, Date before, int task) {
        Set<String> users = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.COMPLETE_TASK) &&
                    logRecord.getTaskNumber() != null &&
                    !logRecord.getTaskNumber().isEmpty() &&
                    Integer.parseInt(logRecord.getTaskNumber()) == task)  users.add(logRecord.getUser());
        }
        return users;
    }

    @Override
    public Set<Date> getDatesForUserAndEvent(String user, Event event, Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getUser().equals(user) && logRecord.getEvent().equals(event)) dates.add(logRecord.getDate());
        }
        return dates;
    }

    @Override
    public Set<Date> getDatesWhenSomethingFailed(Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getStatus().equals(Status.FAILED)) dates.add(logRecord.getDate());
        }
        return dates;
    }

    @Override
    public Set<Date> getDatesWhenErrorOccurred(Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getStatus().equals(Status.ERROR)) dates.add(logRecord.getDate());
        }
        return dates;
    }

    @Override
    public Date getDateWhenUserLoggedInFirstTime(String user, Date after, Date before) {
        Date date = null;
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getUser().equals(user) && logRecord.getEvent().equals(Event.LOGIN))
                if (date == null) date = logRecord.getDate(); else
                    date = logRecord.getDate().compareTo(date) < 0 ? logRecord.getDate(): date;
        }
        return date;
    }

    @Override
    public Date getDateWhenUserAttemptedTask(String user, int task, Date after, Date before) {
        Date date = null;
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) &&
                    logRecord.getUser().equals(user) &&
                    logRecord.getEvent().equals(Event.ATTEMPT_TASK) &&
                    logRecord.getTaskNumber() != null &&
                    !logRecord.getTaskNumber().isEmpty() &&
                    Integer.parseInt(logRecord.getTaskNumber()) == task)
                if (date == null) date = logRecord.getDate(); else
                    date = logRecord.getDate().compareTo(date) < 0 ? logRecord.getDate(): date;
        }
        return date;
    }

    @Override
    public Date getDateWhenUserCompletedTask(String user, int task, Date after, Date before) {
        Date date = null;
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) &&
                    logRecord.getUser().equals(user) &&
                    logRecord.getEvent().equals(Event.COMPLETE_TASK) &&
                    logRecord.getTaskNumber() != null &&
                    !logRecord.getTaskNumber().isEmpty() &&
                    Integer.parseInt(logRecord.getTaskNumber()) == task)
                if (date == null) date = logRecord.getDate(); else
                    date = logRecord.getDate().compareTo(date) < 0 ? logRecord.getDate(): date;
        }
        return date;
    }

    @Override
    public Set<Date> getDatesWhenUserSentMessages(String user, Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getEvent().equals(Event.SEND_MESSAGE) && logRecord.getUser().equals(user)) dates.add(logRecord.getDate());
        }
        return dates;
    }

    @Override
    public Set<Date> getDatesWhenUserDownloadedPlugin(String user, Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getUser().equals(user) && logRecord.getEvent().equals(Event.DOWNLOAD_PLUGIN)) dates.add(logRecord.getDate());
        }
        return dates;
    }

    @Override
    public int getNumberOfEvents(Date after, Date before) {
        return getAllEvents(after, before).size();
    }

    @Override
    public Set<Event> getAllEvents(Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()))
                events.add(logRecord.getEvent());
        }
        return events;
    }

    @Override
    public Set<Event> getEventsForIP(String ip, Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getIp().equals(ip)) events.add(logRecord.getEvent());
        }
        return events;
    }

    @Override
    public Set<Event> getEventsForUser(String user, Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getUser().equals(user))
                events.add(logRecord.getEvent());
        }
        return events;
    }

    @Override
    public Set<Event> getFailedEvents(Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getStatus().equals(Status.FAILED)) events.add(logRecord.getEvent());
        }
        return events;
    }

    @Override
    public Set<Event> getErrorEvents(Date after, Date before) {
        Set<Event> events = new HashSet<>();
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate()) && logRecord.getStatus().equals(Status.ERROR)) events.add(logRecord.getEvent());
        }
        return events;
    }

    @Override
    public int getNumberOfAttemptsToCompleteTask(int task, Date after, Date before) {
        int count = 0;
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate())
                    && logRecord.getEvent().equals(Event.ATTEMPT_TASK)
                    && logRecord.getTaskNumber() != null
                    && !logRecord.getTaskNumber().isEmpty()
                    && Integer.parseInt(logRecord.getTaskNumber()) == task) count++;
        }
        return count;
    }

    @Override
    public int getNumberOfSuccessfulAttemptsToCompleteTask(int task, Date after, Date before) {
        int count = 0;
        for (LogRecord logRecord: getParsedRecords(logDir)) {
            if (isDateInside(after, before, logRecord.getDate())
                    && logRecord.getEvent().equals(Event.COMPLETE_TASK)
                    && logRecord.getTaskNumber() != null
                    && !logRecord.getTaskNumber().isEmpty()
                    && Integer.parseInt(logRecord.getTaskNumber()) == task) count++;
        }
        return count;
    }

    @Override
    public Map<Integer, Integer> getAllAttemptedTasksAndNumberOfAttempts(Date after, Date before) {
        Map<Integer, Integer> events = new HashMap<>();
        Integer number;
        for (LogRecord logRecord: getParsedRecords(logDir)) {

            if (isDateInside(after, before, logRecord.getDate())
                    && logRecord.getEvent().equals(Event.ATTEMPT_TASK)
                    && logRecord.getTaskNumber() != null
                    && !logRecord.getTaskNumber().isEmpty()) {
                number = new Integer(logRecord.getTaskNumber());
                if (events.containsKey(number))
                    events.put(number, events.get(number) + 1);
                else
                    events.put(number, 1);

            }
        }
        return events;
    }

    @Override
    public Map<Integer, Integer> getAllCompletedTasksAndNumberOfCompletions(Date after, Date before) {
        Map<Integer, Integer> events = new HashMap<>();
        Integer number;
        for (LogRecord logRecord: getParsedRecords(logDir)) {

            if (isDateInside(after, before, logRecord.getDate())
                    && logRecord.getEvent().equals(Event.COMPLETE_TASK)
                    && logRecord.getTaskNumber() != null
                    && !logRecord.getTaskNumber().isEmpty()) {
                number = new Integer(logRecord.getTaskNumber());
                if (events.containsKey(number))
                    events.put(number, events.get(number) + 1);
                else
                    events.put(number, 1);

            }
        }
        return events;
    }

    @Override
    public Set<Object> execute(String query) {
        Set<Object> res = new HashSet<>();
        if (query == null || query.isEmpty()) return res;
        Pattern p = Pattern.compile("get (ip|user|date|event|status)"
                + "( for (ip|user|date|event|status) = \"(.*?)\")?"
                + "( and date between \"(.*?)\" and \"(.*?)\")?");
        Matcher m = p.matcher(query);
        String field1 = null;
        String field2 = null;
        String value1 = null;
        Date dateFrom = null;
        Date dateTo = null;
        if (m.find()) {
            field1 = m.group(1);
            field2 = m.group(3);
            value1 = m.group(4);
            String d1 = m.group(6);
            String d2 = m.group(7);
            try {
                dateFrom = new SimpleDateFormat("d.M.yyyy H:m:s").parse(d1);
            } catch (Exception e) {
                dateFrom = null;
            }
            try {
                dateTo = new SimpleDateFormat("d.M.yyyy H:m:s").parse(d2);
            } catch (Exception e) {
                dateTo = null;
            }
            switch (field1) {
                case "ip": {
                    res.addAll(getAllIps(field2, value1, dateFrom, dateTo));
                    break;
                }
                case "user": {
                    res.addAll(getAllUsers(field2, value1, dateFrom, dateTo));
                    break;
                }
                case "date": {
                    res.addAll(getAllDates(field2, value1, dateFrom, dateTo));
                    break;
                }
                case "event": {
                    res.addAll(getAllEvents(field2, value1, dateFrom, dateTo));
                    break;
                }
                case "status": {
                    res.addAll(getAllStatuses(field2, value1, dateFrom, dateTo));
                    break;
                }
            }
        }
        return res;
    }

    private Set<String> getAllIps(String field, String value, Date after, Date before) {
        Set<String> users = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            try {
                if (isDateInside(after, before, record.getDate()) && isFieldMatch(field, value, record)) {
                    users.add(record.getIp());
                }
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return users;
    }

    private Set<Event> getAllEvents(String field, String value, Date after, Date before) {
        Set<Event> set = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            try {
                if (isDateInside(after, before, record.getDate()) && isFieldMatch(field, value, record)) {
                    set.add(record.getEvent());
                }
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return set;
    }
    private Set<Date> getAllDates(String field, String value, Date after, Date before) {
        Set<Date> dates = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            try {
                if (isDateInside(after, before, record.getDate()) && isFieldMatch(field, value, record)) {
                    dates.add(record.date);
                }
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return dates;
    }
    private Set<Status> getAllStatuses(String field, String value, Date after, Date before) {
        Set<Status> set = new HashSet<>();
        for (LogRecord record : getParsedRecords(logDir)) {
            try {
                if (isDateInside(after, before, record.getDate()) && isFieldMatch(field, value, record)) {
                    set.add(record.getStatus());
                }
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return set;
    }


    private class LogRecord {
        private String ip;
        private String user;
        private Date date;
        private Event event;
        private String taskNumber;
        private Status status;
        public LogRecord(String ip, String user, Date date, Event event, Status status) {
            this.ip = ip;
            this.user = user;
            this.date = date;
            this.event = event;
            this.status = status;
        }
        public LogRecord(String record) {
            String[] strings = record.split("\t");
            this.ip = strings[0].trim();
            this.user = strings[1];
            SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy H:m:s");
            try {
                date = dateFormat.parse(strings[2]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String eventAndParameter[] = strings[3].split(" ");
            event = Event.valueOf(eventAndParameter[0]);
            if (eventAndParameter.length > 1) taskNumber = eventAndParameter[1];
            status = Status.valueOf(strings[4]);
        }
        public String getIp() {
            return ip;
        }
        public String getUser() {
            return user;
        }
        public Date getDate() {
            return date;
        }
        public Event getEvent() {
            return event;
        }
        public String getTaskNumber() {
            return taskNumber;
        }
        public Status getStatus() {
            return status;
        }
    }
}
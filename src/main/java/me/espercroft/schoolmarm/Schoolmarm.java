package me.espercroft.schoolmarm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import me.espercroft.schoolmarm.types.Student;

import me.espercroft.util.EventService;

public class Schoolmarm {

    private final ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
    private volatile EventService eventSvc = new EventService(tpe);
    private volatile Map<String, Student> masterIndex = new HashMap<>();
    public volatile long sessionDataVersion = 0;

    public Map<String, Student> getMasterIndex() {
        return masterIndex;
    }

    public EventService getEventService() {
        return eventSvc;
    }

    void initialize() {
                
    }
}

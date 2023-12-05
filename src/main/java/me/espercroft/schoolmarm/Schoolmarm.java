package me.espercroft.schoolmarm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import me.espercroft.util.EventService;

public class Schoolmarm {
	private ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	private EventService eventSvc = new EventService(tpe);
        
	public EventService getEventService() {
		return eventSvc;
	}
}

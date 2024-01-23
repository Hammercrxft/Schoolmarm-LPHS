package me.espercroft.util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class EventService {
	private volatile ThreadPoolExecutor executors;
	private volatile Set<EventHandler> handlers = Collections.synchronizedSet(new HashSet<EventHandler>());
	
	public EventService(ThreadPoolExecutor taskExecutor) {
		executors = taskExecutor;
	}
	
	public void bind(EventHandler evth) throws HandlerAlreadyBoundException {
		if (!handlers.add(evth)) {
			throw new HandlerAlreadyBoundException();
		}
	}
	
	public EventHandler unbind(String handlerName) {
		EventHandler handler = null;
		for (EventHandler h : handlers) {
			if (h.getHandlerName().equals(handlerName)) {
				handler = h;
				handlers.remove(h);
			}
		}
		return handler;
	}
	
	public void fire(Event evt) {
		for (EventHandler handler : handlers) {
			if (handler.getTriggeringEvent().equals(evt.getEventType())) {
				executors.execute(handler.createTask(evt));
				//NOTE do not return! there can be multiple handlers for an event.
			}		
		}
		//TODO handle unhandled events
	}
}

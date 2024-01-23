package me.espercroft.util;

import java.util.List;

public class Event {
	private volatile String eventType;
	private volatile String eventSource;
	private volatile long invocationTimeMillis;
	public volatile List<?> eventData;
	
	@SuppressWarnings("unused")
	private Event() {}
	public Event(String type, String source) {
		eventType = type;
		eventSource = source;
		eventData = null;
		invocationTimeMillis = System.currentTimeMillis();
	}
	public Event(String type, String source, List<?> data) {
		eventType = type;
		eventSource = source;
		eventData = data;
		invocationTimeMillis = System.currentTimeMillis();
	}
	public String getEventType() {
		return eventType;
	}
	public String getEventSource() {
		return eventSource;
	}
	public long getInvocationTimeMillis() {
		return invocationTimeMillis;
	}
}

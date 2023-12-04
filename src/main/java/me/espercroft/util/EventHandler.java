package me.espercroft.util;

public interface EventHandler {
	public String getTriggeringEvent();
	public Runnable createTask(Event evt);
	public String getHandlerName();
}

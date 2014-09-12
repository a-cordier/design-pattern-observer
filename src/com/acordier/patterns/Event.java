package com.acordier.patterns;

public interface Event {
	public long getTimestamp();
	public Object getEventData();
	public Object getOriginator();
}

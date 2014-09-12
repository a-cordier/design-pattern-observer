package com.acordier.patterns;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventImpl implements Event {
	
	private long timestamp;
	private Object eventData;
	private Object originator;
	
	public EventImpl(){
		this.timestamp = new Date().getTime();
	}
		
	public EventImpl(long timestamp, Object eventData, Object originator) {
		this.timestamp = timestamp;
		this.eventData = eventData;
		this.originator = originator;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public Object getEventData() {
		return eventData;
	}

	public void setEventData(Object eventData) {
		this.eventData = eventData;
	}

	@Override
	public Object getOriginator() {
		return originator;
	}

	public void setOriginator(Object originator) {
		this.originator = originator;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy : hh-mm-ss");
		return "EventImpl [timestamp=" + dateFormat.format(new Date(timestamp)) + ", eventData=" + eventData
				+ ", originator=" + originator + "]";
	}	
	
	

}

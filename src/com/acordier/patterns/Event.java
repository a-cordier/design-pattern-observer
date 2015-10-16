package com.acordier.patterns;

public interface Event {
	/** 
	 * Events are time stamped. 
	 * @return event time stamp (when did the event occur)
	 */
	public long getTimestamp();
	/**
	 * Events hold data.
	 * @return an object holding data attached to this event.
	 */
	public Object getEventData();
	/**
	 * Event declare their origin.
	 * @return the object responsible for triggering the event.
	 */
	public Object getOriginator();
}

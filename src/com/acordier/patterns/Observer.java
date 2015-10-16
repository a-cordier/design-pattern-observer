package com.acordier.patterns;


public interface Observer {
	/**
	 * Observer can update itself due to an event
	 * @param event
	 */
	public void update(Event event);
}

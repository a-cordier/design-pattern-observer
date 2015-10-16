package com.acordier.patterns;

import java.util.Collection;

public abstract class Subject {
	
	protected Collection<Observer> observerCollection;
	protected Event event;
	/**
	 * Adding an observer to be notified.
	 * @param observer
	 */
	public void registerObserver(Observer observer) {
		this.observerCollection.add(observer);
	}
	/**
	 * Removing an observer.
	 * @param observer
	 */
	public void unregisterObserver(Observer observer) {
		this.observerCollection.remove(observer);		
	}
	/**
	 * Notify observers.
	 */
	public void notifyObservers() {
		for(Observer observer : observerCollection){
			observer.update(this.event);
		}
	}
}

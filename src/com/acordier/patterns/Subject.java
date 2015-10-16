package com.acordier.patterns;

public interface Subject {
	/**
	 * Adding an observer to be notified.
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	/**
	 * Removing an observer.
	 * @param observer
	 */
	public void unregisterObserver(Observer observer);
	/**
	 * Notify observers.
	 */
	public void notifyObservers();
}

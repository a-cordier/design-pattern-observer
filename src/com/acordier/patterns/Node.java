package com.acordier.patterns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
/**
 * As an implementation of Subject Node can register and notify observers.
 * @author acordier
 *
 */
public class Node implements Subject {
	
	private Collection<Observer> observerCollection;
	private EventImpl event;
	private String name;
	
	public Node(){
		this.event = new EventImpl();
		this.observerCollection = new ArrayList<Observer>();
	}
	
	public Node(String name){
		this();
		this.name = name;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.observerCollection.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		this.observerCollection.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observerCollection){
			observer.update(this.event);
		}
	}

	public void createChildNode(){
		/* business logic to create a child node */
		synchronized(event){
			this.event.setTimestamp(new Date().getTime());
			this.event.setEventData("child removed from node " + this.name);
			this.event.setOriginator(this);
			notifyObservers();
		}
	}
	
	public void removeChildNode(){
		/* business logic to remove a child node */
		synchronized(event){
			this.event.setTimestamp(new Date().getTime());
			this.event.setEventData("child removed from node " + this.name);
			this.event.setOriginator(this);
			notifyObservers();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}
	
	
	
	
}

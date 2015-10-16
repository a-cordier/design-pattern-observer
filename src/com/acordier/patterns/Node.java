package com.acordier.patterns;

import java.util.ArrayList;
import java.util.Date;
/**
 * As an implementation of Subject Node can register and notify observers.
 * @author acordier
 *
 */
public class Node extends Subject {
	
	private String name;
	
	public Node(){
		this.event = new EventImpl();
		this.observerCollection = new ArrayList<Observer>();
	}
	
	public Node(String name){
		this();
		this.name = name;
	}

	public void createChildNode(){
		/* business logic to create a child node */
		synchronized(event){
			((EventImpl)this.event).setTimestamp(new Date().getTime());
			((EventImpl)this.event).setEventData("child removed from node " + this.name);
			((EventImpl)this.event).setOriginator(this);
			notifyObservers();
		}
	}
	
	public void removeChildNode(){
		/* business logic to remove a child node */
		synchronized(event){
			((EventImpl)this.event).setTimestamp(new Date().getTime());
			((EventImpl)this.event).setEventData("child removed from node " + this.name);
			((EventImpl)this.event).setOriginator(this);
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

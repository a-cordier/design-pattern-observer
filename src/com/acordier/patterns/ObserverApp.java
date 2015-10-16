package com.acordier.patterns;
/*
 * Observer
 * A behavioral design-pattern 
 * Any event on Nodes that have registered our 
 * concrete observer will trigger a log event 
 */
public class ObserverApp {

	public static void main(String[] args) {
		Node subjectAlpha = new Node("Alpha");
		Node subjectBeta = new Node("Beta");
		Logger logger = new LoggerImpl();
		Observer observerAlpha = new ConcreteObserver(logger);
		subjectAlpha.registerObserver(observerAlpha);
		subjectBeta.registerObserver(observerAlpha);
		subjectAlpha.createChildNode();
		subjectBeta.removeChildNode();
	}

}

package com.acordier.patterns;

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

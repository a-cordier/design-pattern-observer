package com.acordier.patterns;

public class ConcreteObserver implements Observer {

	Logger logger;
	
	public ConcreteObserver(Logger logger){
		this.logger = logger;
	}
	
	@Override
	public void update(Event event) {
		logger.log(event);
	}

}

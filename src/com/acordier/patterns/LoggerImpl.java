package com.acordier.patterns;

public class LoggerImpl implements Logger {
	
	@Override
	public void log(Event event) {
		System.out.println(event);
		
	}

}

package com.mastering.servlet.controller;

public class MyLogger {
	
	public MyLogger() {
	}

	public void log(String message) {
		System.out.println("::LOG:: - " + message);
	}
}

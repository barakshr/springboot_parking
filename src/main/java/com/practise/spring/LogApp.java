package com.practise.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogApp {
	static final Logger logger = LogManager.getLogger(LogApp.class.getName());
	public static void main(String[] args) {


		logger.info("Info : number is " );

	}
}
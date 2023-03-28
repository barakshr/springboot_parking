package com.practise.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootMain.class);

    public static void main(String[] args) {
        try {
            //ddd
            SpringApplication.run(SpringBootMain.class, args);

        } catch (Exception e) {
           LOGGER.error(e.getMessage());
        }
    }

}



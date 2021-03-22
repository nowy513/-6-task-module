package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;
    private static LoggerInstance loggerInstance;


    @Test
    void testGetLastLog(){
//        Given
        logger = new Logger();
        logger.log("log is made");

//        Then
        String log = logger.getLastLog();
        System.out.println("Log: " + log);
//        Then
        assertEquals("log is made", log);
    }

    @Test
    void testGetLastLogInstance(){
//        Given
        loggerInstance = LoggerInstance.INSTANCE;
        loggerInstance.log("Log 2 is made");
//        Then
        String log = loggerInstance.getLastLog();
        System.out.println("Log: " + log);

        assertEquals("Log 2 is made", log);
    }
}

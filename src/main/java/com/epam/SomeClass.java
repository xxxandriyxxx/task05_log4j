package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeClass {

    private static Logger logger2 = LogManager.getLogger(Application.class);

    public static void GenerateLog() {
        logger2.trace("This is a trace message !!!");
        logger2.debug("This is a debug message !!!");
        logger2.info("This is an info message !!!");
        logger2.warn("This is a warn message !!!");
        logger2.error("This is an error message !!!");
        logger2.fatal("This is a fatal message !!!");
    }

}

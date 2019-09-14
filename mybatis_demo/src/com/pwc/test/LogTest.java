package com.pwc.test;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

public class LogTest {
	Logger logger = Logger.getLogger("logTest1");
	 
    @PostConstruct
    public void test(){
        for (int i=0; i<1000; i++) {
            logger.info(i + "----Log.Info----");
            logger.info(i + "----Log.Info----");
            logger.info(i + "----Log.Info----");
        }
    }
}

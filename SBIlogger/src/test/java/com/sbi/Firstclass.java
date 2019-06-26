package com.sbi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Firstclass {

	private static Logger logger=LogManager.getLogger(Firstclass.class);
	
	public static void main(String[] args) {
        System.out.println("content start");
        logger.info("this is info ");
        logger.error("this is error");
        logger.warn("this is warn");
        logger.fatal("this is fatal");
        logger.trace("this is trace level");
        System.out.println("content stop");
	}

}

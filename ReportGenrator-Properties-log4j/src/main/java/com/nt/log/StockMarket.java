package com.nt.log;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StockMarket {
	//create logger object
	private  Logger logger=Logger.getLogger(StockMarket.class.getName());
	
	public int getAmount(String company) {
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+File.separator +"log4j.properties");
		logger.trace("this is trace message");
		logger.debug("this is debug message "+company);
		logger.info("this is info message "+company);
		logger.warn("this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");
		
		if(company.equalsIgnoreCase("TCS")) {
			return  450;
		}else if(company.equalsIgnoreCase("IBM")){
			return 550;
		}else {
			logger.debug("starting getAmount");
			return 780;
		}
		
	}

}

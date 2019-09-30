package com.nt.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class StockMarket {
	private  Logger logger=Logger.getLogger(StockMarket.class.getName());
	public int getAmount(String company) {
		
		BasicConfigurator.configure();
		logger.info(company);
		logger.debug(company);
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

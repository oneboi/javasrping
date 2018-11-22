package com.oneboi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class User {
	
	private final static Log logger = LogFactory.getLog(User.class);
  public  void add(){
	  
	  System.out.println("i am a add method in User of class");
  }
  
  	public  void  logerking() {
  		logger.debug("DEBUG ...");
  		logger.info("INFO ...");
  		logger.error("ERROR ...");
  	}


}

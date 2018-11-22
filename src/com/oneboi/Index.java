package com.oneboi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		User user=(User) context.getBean("user");
		System.out.println(user);
		  user.add();
		  user.logerking();
 
	}

}

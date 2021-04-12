package com.seleniumexpress.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirtelClient {

  public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
   System.out.println("Beans.xml file loaded");
   Airtel service = context.getBean("airtel",Airtel.class);
   service.activateService();
	
  }	
}

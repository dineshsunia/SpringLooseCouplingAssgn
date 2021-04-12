package com.seleniumexpress.spring.di;

public class Airtel {

	private Service service;

	public Airtel(Service service) {
		this.service = service;
	}


/* public void setService(Service service) {
		this.service = service;
	}*/
	
	public void activateService() {
		
		service.service();
	}


}

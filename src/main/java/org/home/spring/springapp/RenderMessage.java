package org.home.spring.springapp;

public class RenderMessage {
	
	MessageService service;
	
	public MessageService getService() {
		return service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	public String printMessage(){
		return service.getMessage();
	}

}

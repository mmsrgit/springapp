package org.home.spring.client;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Producer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelWeatherFinder {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	CamelContext camelContext = (CamelContext) context.getBean("countryCamelContext");
    	
    	System.out.println(camelContext!=null);
    	
    	final Endpoint myEndpoint = camelContext.getEndpoint("direct:retrieveCountriesWsCall");
    	try{
    		
    		Producer producer = myEndpoint.createProducer();
    		Exchange myExchange = myEndpoint.createExchange(ExchangePattern.InOut );
    		
    		producer.process(myExchange);
    		
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
		
	}

}

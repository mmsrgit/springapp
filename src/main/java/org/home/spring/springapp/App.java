package org.home.spring.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	RenderMessage renderMsg = (RenderMessage)context.getBean("renderMessage");
        System.out.println(renderMsg.printMessage());
    }
}

package com.example.demo.Extra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Name obj=  context.getBean("myName",Name.class);
    	System.out.println(obj.myname());
    	System.out.println(obj.address());
    	
    }
}

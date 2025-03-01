package com.sharma.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sharma.component.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Vehicle v = context.getBean("myCar", Vehicle.class);
        System.out.println(v.getBrand());
    }
}

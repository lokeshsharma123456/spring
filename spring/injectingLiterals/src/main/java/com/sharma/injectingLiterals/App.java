package com.sharma.injectingLiterals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Vehicle.Vehicle;

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
        Vehicle vehicle1 = context.getBean("myVehicleType", Vehicle.class);
        Vehicle vehicle2 = context.getBean("myVehicleType", Vehicle.class);
        System.out.println( "is vehicle1 == vehicle2: " +  (vehicle1 == vehicle2));
         
        
    }
}

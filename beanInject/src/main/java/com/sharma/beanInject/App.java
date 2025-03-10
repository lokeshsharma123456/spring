package com.sharma.beanInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sharma.config.Config;
import com.sharma.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Vehicle bean = context.getBean("carr", Vehicle.class);
        System.out.println(bean.getDiscount());
        System.out.println(bean.getMrp());
    }
}

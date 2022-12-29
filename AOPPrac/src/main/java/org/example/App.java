package org.example;

import service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //spring container//loosely-coupled
        ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
        PaymentService p= ac.getBean("payment",PaymentService.class);
        p.makePayment(500);

    }
}

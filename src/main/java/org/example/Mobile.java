package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
      //container object - which reads config and create objects
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        /*Airtel air= (Airtel) context.getBean("airtel");
        air.calling();
        air.data();
        //second way without typecasting
        Vodafone voda = context.getBean("vodafone",Vodafone.class);
        voda.calling();
        voda.data();*/
        Sim simo = context.getBean("sim",Sim.class);
        simo.calling();
        simo.data();


    }
    public String display(String mob){
        return mob+" new model";
    }
}

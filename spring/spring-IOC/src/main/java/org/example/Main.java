package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Sim newJioConnection =  context.getBean("Sim",Sim.class);

        newJioConnection.calling();
        newJioConnection.dialing();
    }
}

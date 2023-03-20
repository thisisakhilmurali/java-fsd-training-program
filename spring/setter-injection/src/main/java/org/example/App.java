package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Roles theRoleOfHeatBlast = applicationContext.getBean("heatblast", Roles.class);
        Roles theRoleOfGreyMatter = applicationContext.getBean("greymatter", Roles.class);

        theRoleOfHeatBlast.display();
        theRoleOfGreyMatter.display();

    }
}

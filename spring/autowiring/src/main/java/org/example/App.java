package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        NotificationService notificationService = applicationContext.getBean(NotificationService.class);

        notificationService.notifyService();

    }
}

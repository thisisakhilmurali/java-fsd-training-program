package org.example;

public class EmailService implements MessageServices{
    @Override
    public void sendMessage(String theMessage) {
        System.out.println("Email Service: " + theMessage);
    }
}

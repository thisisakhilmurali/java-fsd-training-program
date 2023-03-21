package org.example;

public class SMSServices implements MessageServices{
    @Override
    public void sendMessage(String theMessage) {
        System.out.println("SMS Service: " + theMessage);
    }
}

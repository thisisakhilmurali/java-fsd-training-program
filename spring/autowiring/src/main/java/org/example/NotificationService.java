package org.example;


public class NotificationService {
    private MessageServices messageServices;

    public void setMessageServices(MessageServices messageServices) {
        this.messageServices = messageServices;
    }

    public void notifyService() {
        messageServices.sendMessage("Hey! I'm AutoWire");
    }
}

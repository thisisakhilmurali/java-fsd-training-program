package org.example;

public class Roles {
    public String name;
    public String responsibility;

    public Roles(String name, String responsibility) {
        this.name = name;
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nResponsibility: " + responsibility);
    }
}

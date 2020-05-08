package oop;

public class HumanApp {
    public static void main(String[] args){
        Human stacy = new Human();
        Human fer = new Human();
        stacy.setName("Stacy");
        fer.setName("Fer");
        fer.setEmail(fer.getName() + "@gmail.com");
        stacy.setEmail(stacy.getName() + "@yahoo.com");

        stacy.sendMail("instructors@codeup.com");
        stacy.sendMail("instructors&codeup.com");
        fer.sendMail("support@google.com");
    }
}

package oop;

public class PersonTest {
    public static void main(String[] args) {
        // Creating 2 instances for each case
        Person fer = new Person();
        Person ana = new Person();
        Person deadPerson = new Person();

        System.out.println("Person.race = " + Person.race);

        // Assign values to the fields
        fer.firstName = "Fernando";
        fer.lastName = "Mendoza R";
        fer.isAlive = true;
        ana.firstName = "Ana";
        ana.lastName = "Plant";
        ana.isAlive = true;
        deadPerson.isAlive = false;

        System.out.println("ana.sayHello() = " + ana.sayHello());
        System.out.println("fer.sayHello() = " + fer.sayHello());
        System.out.println("deadPerson.sayHello() = " + deadPerson.sayHello());
    }
}
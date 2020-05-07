package oop;

public class Person {

    public String firstName;
    public String lastName;

    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

}
package oop;

public class Person {

    public static String race = "HUMAN RACE";

    public boolean isAlive;
    public String firstName;
    public String lastName;

    public String sayHello(){
        if(isAlive){
            return String.format("Hello from %s %s!", firstName, lastName);
        } else {
            return "This person is not alive anymore :(";
        }
    }

}
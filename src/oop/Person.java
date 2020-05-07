package oop;

public class Person {

    public static String race = "HUMAN RACE";

    // Creating fields
    private String firstName;
    protected boolean isAlive;
    private String lastName;

    // Creating rules in order to create an instance
    // Everybody should have a First Name, Last Name and a value to know if they are alive
    public Person(String fn, String ln, boolean isAlive){
        this.firstName = fn;
        this.lastName = ln;
        this.isAlive = isAlive;
    }

    public String sayHello(){
        if(this.isAlive){
            return String.format("Hello from %s %s!", this.firstName, this.lastName);
        } else {
            return "This person is not alive anymore :(";
        }
    }

}
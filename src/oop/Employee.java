package oop;

public class Employee extends Person {

    private double salary;

    public Employee(String fn, String ln, boolean isAlive){
        super(fn, ln, isAlive);
    }

    public String sayHello() {
        return "How can I help you?";
    }

    public void doWork(){
        System.out.println("Working");
    }

}

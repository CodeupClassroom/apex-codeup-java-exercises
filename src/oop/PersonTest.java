package oop;

public class PersonTest {
    public static void main(String[] args) {
        Person fer = new Person();
        Person ana = new Person();

        fer.firstName = "Fernando";
        fer.lastName = "Mendoza R";
        ana.firstName = "Ana";
        ana.lastName = "Plant";

        System.out.println("ana.sayHello() = " + ana.sayHello());
        System.out.println("fer.sayHello() = " + fer.sayHello());
    }
}
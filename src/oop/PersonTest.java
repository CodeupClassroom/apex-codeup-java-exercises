package oop;

public class PersonTest {
    public static void main(String[] args) {
        // Creating 2 instances for each case
        Person fer = new Person("Fernando","Mendoza R", true);
        Person ana = new Person("Ana", "Plant", true);
        Person deadPerson = new Person(null, null, false);

        System.out.println("Person.race = " + Person.race);

        System.out.println("ana.sayHello() = " + ana.sayHello());
        System.out.println("fer.sayHello() = " + fer.sayHello());
        System.out.println("deadPerson.sayHello() = " + deadPerson.sayHello());
    }
}
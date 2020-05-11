package oop;

import java.util.Scanner;

public class InheritanceTest {
    public static void main(String[] args) {
        Person myMom = new Person("Tomasa", "Sosa", true);
        Employee fer = new Employee("Fer", "Mendoza", true);

        System.out.println(myMom.sayHello());
        System.out.println(fer.sayHello());
        fer.doWork();

        SuperHero leslie = new SuperHero("Leslie", "Hirsh", "SuperKid");
        System.out.println(leslie.sayHello());
        System.out.println("leslie.getFirstName() = " + leslie.getFirstName());
        System.out.println("leslie.getLastName() = " + leslie.getLastName());

        System.out.println("leslie.getSecretIdentity() = " + leslie.getSecretIdentity());

        Employee dimitri = new Manager("Dimitri", "Antonio", true);

        Employee[] employees = {fer, dimitri, new Manager("Liz", "Maya", true)};

        //2nd version
//        employees[0] = fer;
//        employees[1] = dimitri;
//        employees[2] = new Manager("Liz", "Maya", true);

        for (Employee emp : employees){
            System.out.println(emp.getFullName());
            emp.doWork();
        }

    }
}

package oop;

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


    }
}

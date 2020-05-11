package oop;

public class InheritanceTest {
    public static void main(String[] args) {
        Person myMom = new Person("Tomasa", "Sosa", true);
        Employee fer = new Employee("Fer", "Mendoza", true);

        System.out.println(myMom.sayHello());
        System.out.println(fer.sayHello());
        fer.doWork();

    }
}

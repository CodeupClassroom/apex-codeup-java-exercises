package oop.exercise;

public class Person {

    private String name;

    public Person(String aName){
        this.setName(aName);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.getName());
    }

    public static void main(String[] args) {
        Person fer = new Person("Fer");
        fer.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1.toString());
//        System.out.println(person2.toString());
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.toString());
//        System.out.println(person2.toString());
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

}

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
    }

}

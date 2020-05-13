package collections;

import oop.Person;

import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {

        personTest();

//        String[] names = {"fer", "stacy"};
        ArrayList<String> namesList = new ArrayList<>();

        System.out.println("namesList.isEmpty() = " + namesList.isEmpty());
        namesList.add("fer");
        System.out.println("namesList.isEmpty() = " + namesList.isEmpty());
        namesList.add("stacy");
        namesList.add("douglas");
        namesList.add("emily");
        namesList.add("douglas");
        namesList.add("nando");

        System.out.println("namesList.contains(\"emily\") = " + namesList.contains("emily"));
        System.out.println("namesList.contains(\"emili\") = " + namesList.contains("emili"));

        System.out.println("namesList.get(0) = " + namesList.get(0));

        System.out.println("namesList.indexOf(\"douglas\") = " + namesList.indexOf("douglas"));
        System.out.println("namesList.lastIndexOf(\"douglas\") = " + namesList.lastIndexOf("douglas"));

        System.out.println("namesList.size() = " + namesList.size());

        // removing the last index of douglas
        namesList.remove(namesList.lastIndexOf("douglas"));

        if(!namesList.isEmpty()){
            for (String name : namesList) {
                System.out.println("name = " + name);
            }
        }

    }


    public static void personTest(){

        //Person[] people = size, which props(?)
        ArrayList<Person> people = new ArrayList<>();
        //people[0] = new Person("Fer", "Mendoza", true);
        people.add(new Person("Fer", "Mendoza", true));
        people.add(new Person("Stacy", "Malibu", false));
        people.add(new Person("Ana", "Morton", true));

        for (Person person : people) {
            System.out.println("person.getFullName() = " + person.getFullName());
        }

    }

}

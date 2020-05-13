package collections;

import oop.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

    public static void main(String[] args) {

        hashMapTest();
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

    public static void hashMapTest(){
//        HashMap<Long, String> users = new HashMap<>();
//        users.put(1L, "fmendozaro");
//        users.put(2000000000L, "douglas");
//
//        if(users.containsKey(1L)){
//            System.out.println("users.get(1L) = " + users.get(1L));
//        }
//
//        System.out.println("users.get(20L) = " + users.getOrDefault(20L, "No record found with that key"));
//
//        System.out.println("users.containsValue(\"douglas\") = " + users.containsValue("douglas"));
//        System.out.println("users.containsValue(\"douglass\") = " + users.containsValue("douglass"));

        HashMap<Long, Person> githubUsernames = new HashMap<>();
        githubUsernames.putIfAbsent(3L, new Person("Fer", "Mendoza", true));
        githubUsernames.putIfAbsent(5L, new Person("Stacy", "Malibu", false));
        githubUsernames.putIfAbsent(5L, new Person("Stacy", "Malibu", false));

        // you can loop thru the list of values
        for (Person person : githubUsernames.values()) {
            System.out.println("person.getFullName() = " + person.getFullName());
        }

        // you can loop thru the list of keys
        for (long id : githubUsernames.keySet()) {
            System.out.println("id = " + id);
        }

        // print the id and the full name of each element (Person) in the map
        for (Long key : githubUsernames.keySet()){
            System.out.println("id = " + key);
            Person tempPerson = githubUsernames.get(key);
            System.out.println("fullName = " + tempPerson.getFullName() );
        }
    }

}

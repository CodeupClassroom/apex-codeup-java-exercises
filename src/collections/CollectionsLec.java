package collections;

import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {

//        String[] names = {"fer", "stacy"};
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("fer");
        namesList.add("stacy");
        namesList.add("douglas");
        namesList.add("emily");

        System.out.println("namesList.size() = " + namesList.size());

        for (String name : namesList) {
            System.out.println("name = " + name);
        }

    }

}

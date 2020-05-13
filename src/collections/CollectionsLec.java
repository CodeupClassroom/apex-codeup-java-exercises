package collections;

import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {

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

}

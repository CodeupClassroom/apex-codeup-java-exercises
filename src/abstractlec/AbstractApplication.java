package abstractlec;

import java.text.Normalizer;

public class AbstractApplication {
    public static void main(String[] args){
        Employee douglas = new Instructor("Douglas", "Delivery");

        String douglasWork = douglas.work();
        System.out.println("douglasWork = " + douglasWork);
//        System.out.println(douglas.getDepartment());
//        System.out.println(douglas.getName());
//        Formatter formatter = new ConsoleEmployeeFormatter();
//        Formatter htmlFormatter = new HtmlEmployeeFormatter();
//        System.out.println(formatter.display(douglas));
//        System.out.println(htmlFormatter.display(douglas));

        Formatter[] formatters = {new ConsoleEmployeeFormatter(), new HtmlEmployeeFormatter()};
        for(Formatter formatter : formatters) {
            System.out.println("");
            System.out.println(formatter.display(douglas));
        }

        Door[] doors = {new Door("standard")};
        Light[] lights = {new Light("fixture"), new Light("lamp")};

        Door[] doorsSecondBedroom = {new Door("standard")};
        Light[] lightsSecondBedroom = {new Light("fixture")};

        Room[] rooms = {new Bedroom(15, 25, doors, lights, true),
                        new Bedroom(10, 15, doorsSecondBedroom, lightsSecondBedroom, false)};

        House smallHouse = new House("123 Cool Address", "Slab", rooms);
        System.out.println("The house is " + smallHouse.getSquareFeet() + "sqft");
        smallHouse.switchEverythingOn();
    }
}

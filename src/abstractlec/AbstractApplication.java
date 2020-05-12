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


    }
}

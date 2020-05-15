package util;

import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

//    public Input(){}

    public String getString(){
        return this.getString("Type something: ");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Select y/n");
        String answer = scanner.nextLine();
        return answer.equals("y") ? true : false;
    }

    public int getInt(int min, int max){
        int aNumber;
        try {
            aNumber = Integer.valueOf(this.getString("Give me a number between " + min + " and "  + max));
        } catch (NumberFormatException e) {
            return getInt(min, max);
        }

        if(aNumber < min || aNumber > max){
            System.out.println("Outside of the range, try again");
            return getInt(min, max);
        }
        return aNumber;
    }

    public int getInt(){
        try {
            return Integer.valueOf(this.getString("Give me an integer:"));
        } catch (NumberFormatException e) {
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double aDecimal;
        try {
            aDecimal = Double.valueOf(this.getString("Give me a decimal between " + min + " and "  + max));
        } catch (NumberFormatException e) {
            return getDouble(min, max);
        }

        if(aDecimal < min || aDecimal > max){
            System.out.println("Outside of the range, try again");
            return getDouble(min, max);
        }
        return aDecimal;
    }

    public double getDouble(){
        try {
            return Double.valueOf(this.getString("Give me a decimal:"));
        } catch (NumberFormatException e) {
            return getDouble();
        }
    }

}

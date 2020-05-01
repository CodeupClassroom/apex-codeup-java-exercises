import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

//        System.out.println("Give me a number:");
//        int userNumber = Integer.parseInt(input.nextLine());
//        System.out.println("userNumber = " + userNumber);

//        String param1 = input.nextLine();
//        String param2 = input.nextLine();
//        String param3 = input.nextLine();
//
//        System.out.println("param1 = " + param1);
//        System.out.println("param2 = " + param2);
//        System.out.println("param3 = " + param3);

//        System.out.println("How are you feeling?");
//        String sentence = input.nextLine();
//        System.out.println("sentence = " + sentence);

        System.out.println("Give me the width:");
        float width = Float.parseFloat(input.nextLine());
        System.out.println("Give me the length:");
        float length = Float.parseFloat(input.nextLine());

        float area = width * length;
        float perimeter = (width * 2) + (length * 2);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}

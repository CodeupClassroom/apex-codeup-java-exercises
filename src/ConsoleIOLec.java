import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String greeting = "Salutations";

        System.out.println("What's your full name?");
        String name = scanner.nextLine();
//        String name = "fer";

        System.out.printf("%s, %s Welcome to my java app!", name, greeting);
    }
}

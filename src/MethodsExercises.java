import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("factorial test");
            factorial();
            System.out.println("Do you wish to continue? y/n");
            String answer = scan.nextLine();
            if(answer.toLowerCase().equals("n")){
                break;
            }
        }

        System.out.println("getInteger test");
        getInteger(1, 10);
        System.out.println( 2 == sum(1,1) );
        System.out.println( 0 == sum(-1,1) );
        System.out.println( 0 != sum(-2,-5) );

//        System.out.println(subtract(5,1));
        System.out.println( 4 == subtract(5,1) );
        System.out.println( -2 == subtract(-1,1) );

        System.out.println( 5 == multiply(5,1) );
        System.out.println( -5 == multiply(-1,5) );

        System.out.println( 2 == divide(10,5) );
        System.out.println( 2 == divide(30,15) );
        System.out.println( 0 == divide(30,0) );

        System.out.println( 1 == modulus(5,2) );
        System.out.println( 0 == modulus(6,2) );

    }

    public static double sum(double arg1, double arg2){
        return arg1 + arg2;
    }

    public static double subtract(double arg1, double arg2){
        return arg1 - arg2;
    }

    public static double multiply(double arg1, double arg2){
        return arg1 * arg2;
    }

    public static double divide(double arg1, double arg2){
        if(arg2 == 0){
            System.out.println("Division by zero is not possible, zero is returned");
            return 0;
        }
        return arg1 / arg2;
    }

    public static double modulus(double arg1, double arg2){
        return arg1 % arg2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        // how to proceed
        if( userInput < min || userInput > max ){
            System.out.println("Number is outside of the range");
            return getInteger(min, max);
        } else {
            // how to stop
            System.out.println("Number is within the range");
            return userInput;
        }
    }

    public static void factorial(){
        int userInput = getInteger(1,10);
        long sum = 1;
        for (int fa = userInput; fa > 0; fa--){
            sum *= fa;
        }
        System.out.println("factorial of " + userInput +" = " + sum);
    }

}

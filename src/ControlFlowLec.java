import java.util.Scanner;

public class ControlFlowLec {
    public static boolean left(boolean value) {
        System.out.printf("ControlFlowLec.left was called with a %s value.\n", value);
        return value;
    }

    public static boolean right(boolean value) {
        System.out.printf("ControlFlowLec.right was called with a %s value.\n", value);
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Control Flow Lecture");

//        boolean isTrue = true;
//        System.out.println("isTrue = " + isTrue);

        //Relational operators
        int age = 38;
//
//        // Equality ==
//        boolean isTwentyOne = age == 21;
//        System.out.println("isTwentyOne = " + isTwentyOne);
//
//        // Inequality !=
//        boolean isNotTwentyOne = age != 21;
//        System.out.println("isNotTwentyOne = " + isNotTwentyOne);
//
//        // Less Than <
//        boolean isLessThanTwentyOne = age < 21;
//        System.out.println("isLessThanTwentyOne = " + isLessThanTwentyOne);
//
//        // More Than >
//        boolean isMoreThanTwentyOne = age > 21;
//        System.out.println("isMoreThanTwentyOne = " + isMoreThanTwentyOne);

//        // Greater Than or Equal >=
//        float orderTotal = 30.00F;
//        boolean applyFreeShipping = orderTotal >= 30;
//        System.out.println("applyFreeShipping = " + applyFreeShipping);

//        // Less Than or Equal <=
//        float orderTotal = 15.99F;
//        boolean applySmallOrderSurcharge = orderTotal <= 15.00F;
//        System.out.println("applySmallOrderSurcharge = " + applySmallOrderSurcharge);

        // Logical Operators
        // && And
//        boolean isLoggedIn = true;
//        boolean isAdmin = true;
//        boolean showTheAdminPanel = isLoggedIn && isAdmin && age > 21;
//        System.out.println("showTheAdminPanel = " + showTheAdminPanel);

        // showing evaluation of one side when using a double ampersand.
//        boolean booleanResult = left(false) && right(false);
//        System.out.println("booleanResult = " + booleanResult);
        // || Or
//        boolean isAdmin = false;
//        boolean isAuthor = false;
//        boolean canEditArticle = isAdmin || isAuthor;
//        System.out.println("canEditArticle = " + canEditArticle);

        // & And
//        boolean isLoggedIn = false;
//        boolean isAdmin = true;
//        boolean showTheAdminPanel = isLoggedIn & isAdmin;
//        System.out.println("showTheAdminPanel = " + showTheAdminPanel);

        // showing evaluation of both sides when using a single ampersand.
//        boolean booleanResult = left(false) & right(true);
//        System.out.println("booleanResult = " + booleanResult);

        // | Or
//        boolean isAdmin = true;
//        boolean isAuthor = false;
//        boolean canEditArticle = isAdmin | isAuthor;
//        System.out.println("canEditArticle = " + canEditArticle);

        // ! Not
//        boolean isLoggedIn = true;
//        boolean shouldShowLogin = !isLoggedIn;
//        System.out.println("shouldShowLogin = " + shouldShowLogin);

        // String Comparison Warning

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/n]");
//        String userInput = sc.next();
//
//        // Never do this!
////        boolean confirmation = userInput == "y";
////        System.out.println("confirmation = " + confirmation);
//
//        // Always use .equals to compare Strings.
//        boolean confirmation = userInput.equals("y");
//        System.out.println("confirmation = " + confirmation);

        // Control Structures
        // if

//        int weeksInClass = 10;
//        boolean moreThanHalfWayDone = weeksInClass >= 10;
//        if(moreThanHalfWayDone) {
//            System.out.println("We are more than half way done now!");
//        } else if(weeksInClass != 0) {
//            System.out.printf("We are %s weeks in class.\n", weeksInClass);
//        } else {
//            System.out.println("We have not started class yet.");
//        }

        // Switch
//        int dayNumber = 1;
//
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                //Fell through we need a break.
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("Unknown");
//                break;
//        }

        //While loop
//        int i = 0;
//
//        while (i < 10) {
//            System.out.println("From a while loop: i = " + i);
//            i++;
//        }

        //Do While loop
//        int counter = 0;
//        do {
//            System.out.println("From a do while loop: counter = " + counter);
//            counter++;
//        } while (counter < 10);

        //For loop
//        for(int a = 0; a < 10; a++){
//            System.out.println("From a for loop: a = " + a);
//        }

//        for(int i = 1; i <= 10; i++){ // <--+
//            if(i % 2 == 1) { //             |
//                continue; // ---------------+ Continue to the next iteration.
//            } else if( i > 5) {
//                break; // --------------------+ Break out of the loop.
//            } //                              |
//            System.out.println("i = " + i);// |
//        }  //                                 |
//        // <----------------------------------+
    }
}

public class MethodsExercises {
    public static void main(String[] args) {
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
        return arg1 / arg2;
    }

}

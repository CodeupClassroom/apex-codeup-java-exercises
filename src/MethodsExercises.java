public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println( 2 == sum(1,1) );
        System.out.println( 0 == sum(-1,1) );
        System.out.println( 0 != sum(-2,-5) );
    }

    public static double sum(double arg1, double arg2){
        return arg1 + arg2;
    }

}

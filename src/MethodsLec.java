public class MethodsLec {

    public static void main(String[] args) {
        System.out.println("sum() " + sum(1, 2));
        System.out.println("sayHello() = " + sayHello("Douglas"));
    }

    public static String sayHello(String name){
        sum(1,2);
        return "Hi " + name;
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

}

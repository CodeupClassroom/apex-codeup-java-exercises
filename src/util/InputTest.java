package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("you typed: " + input.getString());

//        System.out.println("yes or no: " + input.yesNo());

        System.out.println("input.getInt(1,5) = " + input.getInt(1,5));

        System.out.println("input.getInt() = " + input.getInt());

        System.out.println("input.getDouble() = " + input.getDouble());
        System.out.println("input.getDouble(min, max) = " + input.getDouble(5.5, 10.90));

    }
}

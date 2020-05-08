package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle aCircle;

        while(input.yesNo()){
            aCircle = new Circle(input.getDouble());
            System.out.println("aCircle.getArea() = " + aCircle.getArea());
            System.out.println("aCircle.getCircumference() = " + aCircle.getCircumference());

        }

        System.out.println("Circle.getCount() = " + Circle.getCount());

    }
}

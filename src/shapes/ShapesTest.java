package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle(2, 3);
//        // a square is morphing into a rectangle
//        Rectangle sq = new Square(5);

        Measurable myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(2, 3);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
    }
}

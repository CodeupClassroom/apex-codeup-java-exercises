package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 3);
        // a square is morphing into a rectangle
        Rectangle sq = new Square(5);

        System.out.println("rec.getArea() = " + rec.getArea());
        System.out.println("rec.getPerimeter() = " + rec.getPerimeter());

        System.out.println("sq.getArea() = " + sq.getArea());
        System.out.println("sq.getPerimeter() = " + sq.getPerimeter());
    }
}

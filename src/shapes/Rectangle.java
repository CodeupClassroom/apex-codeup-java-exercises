package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter from Rect");
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        System.out.println("getArea from Rect");
        return this.length * this.width;
    }

}

package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter from Sq");
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        System.out.println("getArea from Sq");
        return Math.pow(super.width, 2);
    }

}

package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("getArea from Rect");
        return this.length * this.width;
    }

    public double getPerimeter(){
        System.out.println("getPerimeter from Rect");
        return (this.length * 2) + (this.width * 2);
    }

}

package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    // Encapsulation

    public double getArea(){
        System.out.println("getPerimeter from Sq");
        return Math.pow(super.width, 2);
    }

    public double getPerimeter(){
        System.out.println("getPerimeter from Sq");
        return 4 * super.length;
    }

}

package Figures.Quadrilateral;

public class Square extends Quadrilateral {

    private double lengthOFfEdge;
    private double area;
    private double perimeter;

    public Square(double lengthOFfEdge) {
        setLengthOFfEdge(lengthOFfEdge);
    }

    public void setLengthOFfEdge(double lengthOFfEdge) { this.lengthOFfEdge = lengthOFfEdge; }
    public double getLengthOFfEdge() { return lengthOFfEdge; }

    @Override
    public void area() {
        area = getLengthOFfEdge() * getLengthOFfEdge();
    }

    public double getArea() { return area; }

    public void getAreaVoid() {
        System.out.println("S = " + getArea());
    }

    public double getPerimeter() { return perimeter; }

    @Override
    public void perimeter() {
        perimeter = getLengthOFfEdge() * 4;
    }

    public void getPerimeterVoid() {
        System.out.println("P = " + getPerimeter());
    }
}

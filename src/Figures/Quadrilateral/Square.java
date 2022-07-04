package Figures.Quadrilateral;

public class Square extends Quadrilateral {

    private double lengthOFfEdge;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("квадрат");
    }

    public Square(double lengthOFfEdge) {
        typeOfFigure();
        setLengthOFfEdge(lengthOFfEdge);
    }

    public void setLengthOFfEdge(double lengthOFfEdge) { this.lengthOFfEdge = lengthOFfEdge; }
    public double getLengthOFfEdge() { return lengthOFfEdge; }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        area = getLengthOFfEdge() * getLengthOFfEdge();
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = getLengthOFfEdge() * 4;
        System.out.println("P = " + getPerimeter());
    }
}

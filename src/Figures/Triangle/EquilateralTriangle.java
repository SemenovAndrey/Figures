package Figures.Triangle;

public class EquilateralTriangle extends Triangle {

    private double side;

    private double height;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("равносторонний");
    }

    public EquilateralTriangle(double side) {
        typeOfFigure();
        setSide(side);
    }

    public void setSide(double side) { this.side = side; }
    public double getSide() { return side; }

    @Override
    public double getHeight() { return height; }

    @Override
    public void printHeight() {
        height = Math.sqrt(Math.pow(getSide(), 2) - Math.pow(getSide() / 2, 2));
        System.out.println("h = " + getHeight());
    }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        area = (getSide() * getHeight()) / 2;
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = getSide() * 3;
        System.out.println("P = " + getPerimeter());
    }
}

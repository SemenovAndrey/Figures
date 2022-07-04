package Figures.Quadrilateral;

public class Diamond extends Quadrilateral {

    private double diagonal1;
    private double diagonal2;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("ромб");
    }

    public Diamond(double diagonal1, double diagonal2) {
        typeOfFigure();
        setDiagonal1(diagonal1);
        setDiagonal2(diagonal2);
    }

    public void setDiagonal1(double diagonal1) { this.diagonal1 = diagonal1; }
    public double getDiagonal1() { return diagonal1; }

    public void setDiagonal2(double diagonal2) { this.diagonal2 = diagonal2; }
    public double getDiagonal2() { return diagonal2; }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        area = getDiagonal1() * getDiagonal2() / 2;
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2)) * 4;
        System.out.println("P = " + getPerimeter());
    }
}

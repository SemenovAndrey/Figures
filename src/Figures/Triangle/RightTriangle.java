package Figures.Triangle;

public class RightTriangle extends Triangle {

    private double largerLeg;
    private double smallerLeg;
    private double hypotenuse;

    private double height;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("прямоугольный");
    }

    public RightTriangle(double largerLeg, double smallerLeg, double hypotenuse) {
        typeOfFigure();
        setLargerLeg(largerLeg);
        setSmallerLeg(smallerLeg);
        setHypotenuse(hypotenuse);
    }

    public void setLargerLeg(double largerLeg) { this.largerLeg = largerLeg; }
    public double getLargerLeg() { return largerLeg; }

    public void setSmallerLeg(double smallerLeg) { this.smallerLeg = smallerLeg; }
    public double getSmallerLeg() { return smallerLeg; }

    public void setHypotenuse(double hypotenuse) { this.hypotenuse = hypotenuse; }
    public double getHypotenuse() { return hypotenuse; }

    @Override
    public double getHeight() { return height; }

    @Override
    public void printHeight() {
        System.out.println("h = " + getHeight());
    }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        System.out.println("S = a * b / 2");
        area = (getLargerLeg() * getSmallerLeg()) / 2;
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = getHypotenuse() + getSmallerLeg() + getLargerLeg();
        System.out.println("P = " + getPerimeter());
    }
}

package Figures.Quadrilateral;

public class Trapezium extends Quadrilateral {

    private double lowerBaseZOfTrapezium;
    private double upperBaseZOfTrapezium;
    private double firstSideOfTrapezium;
    private double secondSideOfTrapezium;
    private double height;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("трапеция");
    }

    public Trapezium(double lowerBaseZOfTrapezium, double upperBaseZOfTrapezium,
                     double firstSideOfTrapezium,
                     double secondSideOfTrapezium,
                     double height) {
        typeOfFigure();
        setLowerBaseZOfTrapezium(lowerBaseZOfTrapezium);
        setUpperBaseZOfTrapezium(upperBaseZOfTrapezium);
        setFirstSideOfTrapezium(firstSideOfTrapezium);
        setSecondSideOfTrapezium(secondSideOfTrapezium);
        setHeight(height);
    }

    public void setLowerBaseZOfTrapezium(double lowerBaseZOfTrapezium) { this.lowerBaseZOfTrapezium = lowerBaseZOfTrapezium; }
    public double getLowerBaseZOfTrapezium() { return lowerBaseZOfTrapezium; }

    public void setUpperBaseZOfTrapezium(double upperBaseZOfTrapezium) { this.upperBaseZOfTrapezium = upperBaseZOfTrapezium; }
    public double getUpperBaseZOfTrapezium() { return upperBaseZOfTrapezium; }

    public void setFirstSideOfTrapezium(double firstSideOfTrapezium) { this.firstSideOfTrapezium = firstSideOfTrapezium; }
    public double getFirstSideOfTrapezium() { return firstSideOfTrapezium; }

    public void setSecondSideOfTrapezium(double secondSideOfTrapezium) { this.secondSideOfTrapezium = secondSideOfTrapezium; }
    public double getSecondSideOfTrapezium() { return secondSideOfTrapezium; }

    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        area = ((getLowerBaseZOfTrapezium() + getUpperBaseZOfTrapezium()) / 2) * getHeight();
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = getLowerBaseZOfTrapezium() + getUpperBaseZOfTrapezium() + getFirstSideOfTrapezium() + getSecondSideOfTrapezium();
        System.out.println("P = " + getPerimeter());
    }
}

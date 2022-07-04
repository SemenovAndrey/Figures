package Figures.Triangle;

public class IsoscelesTriangle extends Triangle {

    private double lowerBaseOfTriangle;
    private double sideOfTriangle;
    private double corner;

    private double height;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("равнобедренный");
    }

    public IsoscelesTriangle(double lowerBaseOfTriangle, double sideOfTriangle) {
        typeOfFigure();
        setLowerBaseOfTriangle(lowerBaseOfTriangle);
        setSideOfTriangle(sideOfTriangle);
    }

    public void setLowerBaseOfTriangle(double lowerBaseOfTriangle) { this.lowerBaseOfTriangle = lowerBaseOfTriangle; }
    public double getLowerBaseOfTriangle() { return lowerBaseOfTriangle; }

    public void setSideOfTriangle(double sideOfTriangle) { this.sideOfTriangle = sideOfTriangle; }
    public double getSideOfTriangle() { return sideOfTriangle; }

    public void setCorner(double corner) { this.corner = corner; }
    public double getCorner() { return corner; }

    @Override
    public double getHeight() { return height; }

    @Override
    public void printHeight() {
        height = Math.sqrt(Math.pow(getSideOfTriangle(), 2) - Math.pow(getLowerBaseOfTriangle() / 2, 2));
        System.out.println("h = " + getHeight());
    }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        area = (getLowerBaseOfTriangle() * getHeight()) / 2;
        System.out.println("S = " + getArea());
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        perimeter = getLowerBaseOfTriangle() + getSideOfTriangle() * 2;
        System.out.println("P = " + getPerimeter());
    }
}

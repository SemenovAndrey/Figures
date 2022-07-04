package Figures.Quadrilateral;

public class Parallelogram extends Quadrilateral {

    private double firstLength; // нижняя сторона
    private double secondLength; // боковая сторона
    private double height;
    private double area;
    private double perimeter;

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("параллелограмм");
    }

    public Parallelogram(double firstLength, double secondLength, double height) {
        setFirstLength(firstLength);
        setSecondLength(secondLength);
        setHeight(height);
    }

    public void setFirstLength(double firstLength) { this.firstLength = firstLength; }
    public double getFirstLength() { return firstLength; }

    public void setSecondLength(double secondLength) { this.secondLength = secondLength; }
    public double getSecondLength() { return secondLength; }

    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }
    public double getArea() { return area; }

    public void printArea() {
        area = getFirstLength() * getHeight();
        System.out.println("S = " + getArea());
    }

    public double getPerimeter() { return perimeter; }

    public void printPerimeter() {
        perimeter = 2 * (getFirstLength() + getSecondLength());
        System.out.println("P = " + getPerimeter());
    }

    public void checkErrorAndPrint(Parallelogram parallelogram) {
        Parallelogram newParallelogramm = new Parallelogram(parallelogram.firstLength, parallelogram.secondLength, parallelogram.height);
        if (newParallelogramm.getSecondLength() < newParallelogramm.height) {
            System.out.println("Данного параллелограмма не существует");
        } else {
            typeOfFigure();
            parallelogram.printArea();
            parallelogram.printPerimeter();
        }
    }
}

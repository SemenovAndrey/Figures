package Figures.Triangle;

public abstract class Triangle {

    public void typeOfFigure() {
        System.out.print("Фигура - треугольник. В данном случае - ");
    }

    public abstract double getHeight();
    public abstract void printHeight();

    public abstract double getArea();
    public abstract void printArea();
    public abstract double getPerimeter();
    public abstract void printPerimeter();
}

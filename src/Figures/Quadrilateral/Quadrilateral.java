package Figures.Quadrilateral;

public abstract class Quadrilateral {

    public void typeOfFigure() {
        System.out.print("Фигура - четырёхугольник. В данном случае - ");
    }

    public abstract double getArea();
    public abstract void printArea();
    public abstract double getPerimeter();
    public abstract void printPerimeter();
}

package Figures.Quadrilateral;

public abstract class Quadrilateral {

    public void typeOfFigure() {
        System.out.println("Эта фигура - четырёхугольник");
    }

    public abstract void area();
    public abstract void perimeter();
}

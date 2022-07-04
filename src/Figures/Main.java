package Figures;

import Figures.Quadrilateral.*;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        square.printArea();
        square.printPerimeter();
        System.out.println();

        ConvexQuadrilateral newFigure = new ConvexQuadrilateral(4, 3, 2 ,6);
        newFigure.printArea();
        newFigure.printPerimeter();
        System.out.println();

        Parallelogram parallelogram = new Parallelogram(10, 5, 4);
        parallelogram.checkErrorAndPrint(parallelogram);
        System.out.println();

        Diamond diamond = new Diamond(3, 4);
        diamond.printArea();
        diamond.printPerimeter();
        System.out.println();

        Trapezium trapezium = new Trapezium(10, 4, 5, 5, 4);
        trapezium.printArea();
        trapezium.printPerimeter();
        System.out.println();
    }
}

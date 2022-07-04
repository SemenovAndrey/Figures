package Figures;

import Figures.Quadrilateral.*;
import Figures.Triangle.*;

public class Main {

    public static void main(String[] args) {
        // Четырёхугольники
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


        // Треугольники
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(6, 5);
        isoscelesTriangle.printHeight();
        isoscelesTriangle.printArea();
        isoscelesTriangle.printPerimeter();
        System.out.println();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(4);
        equilateralTriangle.printHeight();
        equilateralTriangle.printArea();
        equilateralTriangle.printPerimeter();
        System.out.println();

        RightTriangle rightTriangle = new RightTriangle(4, 3, 5);
        rightTriangle.printArea();
        rightTriangle.printPerimeter();
        System.out.println();
    }
}

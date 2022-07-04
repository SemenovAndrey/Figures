package Figures.Quadrilateral;

public class ConvexQuadrilateral extends Quadrilateral {

    private double lengthOfEdge1, lengthOfEdge2, lengthOfEdge3, lengthOfEdge4;
    private double area;
    private double perimeter;

    double[] lengthsOfEdges = new double[4];

    @Override
    public void typeOfFigure() {
        super.typeOfFigure();
        System.out.println("выпуклый четырёхугольник");
    }

    public ConvexQuadrilateral(double lengthOfEdge1, double lengthOfEdge2, double lengthOfEdge3, double lengthOfEdge4) {
        typeOfFigure();
        setLengthOfEdge1(lengthOfEdge1);
        setLengthOfEdge2(lengthOfEdge2);
        setLengthOfEdge3(lengthOfEdge3);
        setLengthOfEdge4(lengthOfEdge4);

        lengthsOfEdges[0] = getLengthOfEdge1();
        lengthsOfEdges[1] = getLengthOfEdge2();
        lengthsOfEdges[2] = getLengthOfEdge3();
        lengthsOfEdges[3] = getLengthOfEdge4();
    }

    public void setLengthOfEdge1(double lengthOfEdge1) { this.lengthOfEdge1 = lengthOfEdge1; }
    public double getLengthOfEdge1() { return lengthOfEdge1; }

    public void setLengthOfEdge2(double lengthOfEdge2) { this.lengthOfEdge2 = lengthOfEdge2; }
    public double getLengthOfEdge2() { return lengthOfEdge2; }

    public void setLengthOfEdge3(double lengthOfEdge3) { this.lengthOfEdge3 = lengthOfEdge3; }
    public double getLengthOfEdge3() { return lengthOfEdge3; }

    public void setLengthOfEdge4(double lengthOfEdge4) { this.lengthOfEdge4 = lengthOfEdge4; }
    public double getLengthOfEdge4() { return lengthOfEdge4; }

    @Override
    public double getArea() { return area; }

    @Override
    public void printArea() {
        System.out.println("S = d1 * d2 * sinα");
    }

    @Override
    public double getPerimeter() { return perimeter; }

    @Override
    public void printPerimeter() {
        for (double length : lengthsOfEdges) {
            perimeter += length;
        }
        System.out.println("P = " + getPerimeter());
    }
}

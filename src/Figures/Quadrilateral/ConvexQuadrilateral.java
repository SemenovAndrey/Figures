package Figures.Quadrilateral;

public class ConvexQuadrilateral {

    private double lengthOfEdge1, lengthOfEdge2, lengthOfEdge3, lengthOfEdge4;
    private double area;
    private double perimeter;

    double[] lengthsOfEdges = new double[4];

    public ConvexQuadrilateral(double lengthOfEdge1, double lengthOfEdge2, double lengthOfEdge3, double lengthOfEdge4) {
        setLengthOfEdge1(lengthOfEdge1);
        setLengthOfEdge2(lengthOfEdge2);
        setLengthOfEdge3(lengthOfEdge3);
        setLengthOfEdge4(lengthOfEdge4);
    }

    public void setLengthOfEdge1(double lengthOfEdge1) { this.lengthOfEdge1 = lengthOfEdge1; }
    public double getLengthOfEdge1() { return lengthOfEdge1; }

    public void setLengthOfEdge2(double lengthOfEdge2) { this.lengthOfEdge2 = lengthOfEdge2; }
    public double getLengthOfEdge2() { return lengthOfEdge2; }

    public void setLengthOfEdge3(double lengthOfEdge3) { this.lengthOfEdge3 = lengthOfEdge3; }
    public double getLengthOfEdge3() { return lengthOfEdge3; }

    public void setLengthOfEdge4(double lengthOfEdge4) { this.lengthOfEdge4 = lengthOfEdge4; }
    public double getLengthOfEdge4() { return lengthOfEdge4; }

    public void area() {
        System.out.println("S = d1 * d2 * sinα");
    }

    // public double getArea() { return area; }

    public void perimeter() {
        for (double length : lengthsOfEdges) {
            perimeter += length;
        }
    }

    public double getPerimeter() { return perimeter; }

    public void getPerimeterVoid() {
        System.out.println("P = " + getPerimeter());
    }
}

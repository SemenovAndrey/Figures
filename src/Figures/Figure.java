package Figures;

public abstract class Figure {

    private int numberOfEdges;
    private double lengthOfEdge;

    public double[] lengthsOfEdges = new double[numberOfEdges];

    public void setNumberOfEdges(int numberOfEdges) { this.numberOfEdges = numberOfEdges; }
    public int getNumberOfEdges() { return numberOfEdges; }

    public void setLengthOfEdge(double lengthOfEdge) { this.lengthOfEdge = lengthOfEdge; }
    public double getLengthOfEdge() { return lengthOfEdge; }

    public abstract void area();
    public abstract void perimeter();
    public abstract void numberOfEdges();
    public abstract void printAllLengths();
}

package Figures;

public abstract class Figure {

    private int numberOfEdges;
    private double lengthOfEdge;

    public double[] lengthsOfEdges = new double[numberOfEdges];

    Figure() {
    }

    Figure(int numberOfEdges, float[] lengthsOfEdges) {
        setNumberOfEdges(numberOfEdges);
    }

    public void setNumberOfEdges(int numberOfEdges) { this.numberOfEdges = numberOfEdges; }
    public int getNumberOfEdges() { return numberOfEdges; }

    public void setLengthOfEdge(double lengthOfEdge) { this.lengthOfEdge = lengthOfEdge; }
    public double getLengthOfEdge() { return lengthOfEdge; }

    public abstract void area(Figure figure);
    public abstract void perimeter(Figure figure);
}

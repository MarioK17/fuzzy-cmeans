package fuzzy;

import org.apache.commons.math3.ml.clustering.Clusterable;

public class VectorWrapper implements Clusterable {

    private double[] points;
    private Vector vector;


    public VectorWrapper(Vector vector) {
        this.vector = vector;
        this.points = vector.getValores();
    }

    public Vector getVector() {
        return vector;
    }

    public double[] getPoint() {
        return points;
    }
}

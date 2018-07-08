import org.apache.commons.math3.ml.clustering.Clusterable;

public class UniversidadWrapper implements Clusterable {

    private double[] points;
    private Universidad universidad;


    public UniversidadWrapper(Universidad universidad) {
        this.universidad = universidad;
        this.points = new double[] {universidad.getAdmitance(), universidad.getEnrolled(), universidad.getAcademics()};
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public double[] getPoint() {
        return points;
    }
}

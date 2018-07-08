import com.opencsv.bean.CsvBindByName;
import org.apache.commons.math3.ml.clustering.Clusterable;

public class Universidad {


    private String name;

    private double admitance;

    private double enrolled;

    private double academics;

    public Universidad() {
    }

    public Universidad(String name, double admitance, double enrolled, double academics) {
        this.name = name;
        this.admitance = admitance;
        this.enrolled = enrolled;
        this.academics = academics;
    }

    public String getName() {
        return name;
    }

    public double getAdmitance() {
        return admitance;
    }

    public void setAdmitance(double admitance) {
        this.admitance = admitance;
    }

    public double getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(double enrolled) {
        this.enrolled = enrolled;
    }

    public double getAcademics() {
        return academics;
    }

    public void setAcademics(double academics) {
        this.academics = academics;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "name='" + name + '\'' +
                ", admitance=" + admitance +
                ", enrolled=" + enrolled +
                ", academics=" + academics +
                '}';
    }
}

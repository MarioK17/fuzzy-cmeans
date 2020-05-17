package fuzzy;

import com.opencsv.bean.CsvBindByName;
import org.apache.commons.math3.ml.clustering.Clusterable;

import java.util.Arrays;

public class Vector {

    private String name;
    private double[] valores;

    public Vector() {
    }

    public Vector(String name, double[] valores) {
        this.name = name;
        this.valores = valores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "name='" + name + '\'' +
                ", valores=" + Arrays.toString(valores) +
                '}';
    }
}

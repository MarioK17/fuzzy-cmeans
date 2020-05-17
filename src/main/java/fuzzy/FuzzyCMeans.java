package fuzzy;

import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;

import java.util.ArrayList;
import java.util.List;

public class FuzzyCMeans {

    private List<Vector> vectores;
    private int clusterNumber;
    private String[] titles;

    public FuzzyCMeans(List<Vector> vectores, int clusterNumber, String[] titles) {
        this.vectores = vectores;
        this.clusterNumber = clusterNumber;
        this.titles = titles;
    }

    public void cmeans() {

        List<VectorWrapper> clusterInput = new ArrayList<VectorWrapper>(vectores.size());
        for(Vector vector : vectores) {
            clusterInput.add(new VectorWrapper(vector));
        }

        FuzzyKMeansClusterer<VectorWrapper> clusterer = new FuzzyKMeansClusterer(clusterNumber,2);

        List<CentroidCluster<VectorWrapper>> clusterResults = clusterer.cluster(clusterInput);

        System.out.println(clusterer.getMembershipMatrix());

        new Grafico(clusterResults, vectores.size(), titles);


    }

}

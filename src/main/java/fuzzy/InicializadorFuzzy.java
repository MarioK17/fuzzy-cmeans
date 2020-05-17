package fuzzy;

import java.util.List;

public class InicializadorFuzzy {

    private String filePath = "";
    private int clusterNumber;

    public InicializadorFuzzy(String filePath, int clusterNumber) {
        this.filePath = filePath;
        this.clusterNumber = clusterNumber;
    }

    public void ejecutar() {

        CSV csv = new CSV(filePath);
        csv.leerCSV();

        List<Vector> universidades = csv.getUniversidades();
        String[] titles = csv.getTitles();

        FuzzyCMeans cMeans;
        cMeans = new FuzzyCMeans(universidades, clusterNumber, titles);
        cMeans.cmeans();

    }

}

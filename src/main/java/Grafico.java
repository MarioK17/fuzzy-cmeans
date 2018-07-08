import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.math.plot.Plot3DPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;


public class Grafico {

    private List<CentroidCluster<UniversidadWrapper>> clusterResults;
    private int size;

    public Grafico(List<CentroidCluster<UniversidadWrapper>> clusterResults, int size) {
        super();
        this.clusterResults = clusterResults;
        this.size = size;
        init();
    }


    public void init(){

        Random r = new Random();
        Color[]   colors = new Color[size];

        Plot3DPanel plot = new Plot3DPanel();

        for (int i = 0; i<clusterResults.size(); i++) {

            System.out.println("Cluster " + i);

            float cx = r.nextFloat();
            float cy = r.nextFloat();
            float cz = r.nextFloat();
            Color color = new Color(cx, cy, cz);

            int numeroPuntosCluster = clusterResults.get(i).getPoints().size();

            double[] pointsx = new double[numeroPuntosCluster];
            double[] pointsy = new double[numeroPuntosCluster];
            double[] pointsz = new double[numeroPuntosCluster];

            for (int j = 0; j < numeroPuntosCluster; j++) {

                float x = (float) clusterResults.get(i).getPoints().get(j).getUniversidad().getAdmitance();
                float y = (float) clusterResults.get(i).getPoints().get(j).getUniversidad().getAcademics();
                float z = (float) clusterResults.get(i).getPoints().get(j).getUniversidad().getEnrolled();

                pointsx[j] = x;
                pointsy[j] = y;
                pointsz[j] = z;
            }

            plot.addScatterPlot("Cluster " + i, color, pointsx, pointsy, pointsz);
        }

        JFrame jFrame = new JFrame("Plot");
        jFrame.setContentPane(plot);
        jFrame.setSize(600,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
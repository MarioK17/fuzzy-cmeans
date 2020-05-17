package fuzzy;

import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.math.plot.Plot3DPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;


public class Grafico {

    private List<CentroidCluster<VectorWrapper>> clusterResults;
    private int size;
    private String[] titles;

    public Grafico(List<CentroidCluster<VectorWrapper>> clusterResults, int size, String[] titles) {
        this.clusterResults = clusterResults;
        this.size = size;
        this.titles = titles;
        init();
    }

    public void init(){

        Random r = new Random();
        Color[] colors = new Color[size];
        String[] names = new String[size];

        Plot3DPanel plot = new Plot3DPanel();

        for (int i = 0; i<clusterResults.size(); i++) {

            System.out.println("Cluster " + i);

            /*float cx = (float) (r.nextFloat());
            float cy = (float) (r.nextFloat());
            float cz = (float) (r.nextFloat());*/
            final float hue = r.nextFloat();
            final float saturation = 0.8f;//1.0 for brilliant, 0.0 for dull
            final float luminance = 1.0f; //1.0 for brighter, 0.0 for black

            Color color = Color.getHSBColor(hue, saturation, luminance);

            int numeroPuntosCluster = clusterResults.get(i).getPoints().size();

            double[] pointsx = new double[numeroPuntosCluster];
            double[] pointsy = new double[numeroPuntosCluster];
            double[] pointsz = new double[numeroPuntosCluster];

            for (int j = 0; j < numeroPuntosCluster; j++) {

                float x = (float) clusterResults.get(i).getPoints().get(j).getVector().getValores()[0];
                float y = (float) clusterResults.get(i).getPoints().get(j).getVector().getValores()[1];
                float z = (float) clusterResults.get(i).getPoints().get(j).getVector().getValores()[2];


                pointsx[j] = x;
                pointsy[j] = y;
                pointsz[j] = z;
            }

            plot.addScatterPlot("Cluster " + i, color, pointsx, pointsy, pointsz);
        }

        plot.setAxisLabels(titles);

        cargarVentana(plot);


    }

    private void cargarVentana(Plot3DPanel plot) {

        JFrame jFrame = new JFrame("Gráfico");
        jFrame.setContentPane(plot);
        jFrame.setSize(600,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
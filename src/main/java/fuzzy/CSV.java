package fuzzy;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    private String file = "";
    private List<Vector> universidades;
    private String[] titles;

    public CSV(String file) {
        this.file = file;
        universidades = new ArrayList<Vector>();
    }

    public void leerCSV() {

        String csvFile = file;

        CSVReader reader = null;
        CSVParser parser = null;

        try {

            //parser = new CSVParserBuilder().withSeparator(';').build();
            reader = new CSVReaderBuilder(new FileReader(csvFile)).withSkipLines(0).build();

            String[] line;

            int contLinea = 0;
            boolean flag = true;

            while ((line = reader.readNext()) != null) {

                Vector vector = null;
                String name = "";
                double[] valores = new double[line.length];
                int j = 0;
                for (int i = 0; i < line.length; i++) {

                    if(contLinea == 0) {

                        if(flag) {
                            titles = new String[line.length-1];
                            flag = false;
                        }
                        if(i!=0) {
                            titles[i-1] = line[i];
                        }

                    } else if(i==0) {
                        name = line[i];
                    } else {
                        valores[j] = Double.parseDouble(line[i]);
                        j++;
                    }

                }
                contLinea++;
                vector = new Vector(name, valores);

                universidades.add(vector);
                System.out.println(vector);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Vector> getUniversidades() {
        return universidades;
    }

    public String[] getTitles() {
        return titles;
    }
}

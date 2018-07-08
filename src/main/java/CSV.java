import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSV {

    public static void main(String[] args) {

        String csvFile = "src/datos.csv";

        CSVReader reader = null;
        CSVParser parser = null;

        try {

            parser = new CSVParserBuilder().withSeparator(';').build();
            reader = new CSVReaderBuilder(new FileReader(csvFile)).withCSVParser(parser).build();

            String[] line;

            int cont = 0;

            while ((line = reader.readNext()) != null) {
                System.out.println(line.length);
                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            List<Universidad> beans =
                    new CsvToBeanBuilder<Universidad>(new FileReader(csvFile))
                            //.withSkipLines(2)
                            .withSeparator(';')
                            .withType(Universidad.class)
                            .build().parse();

            for (Universidad bean : beans) {

                System.out.println(bean);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


    }

}

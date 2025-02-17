package Utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<String> readProductNames(String filePath) throws IOException {
        List<String> productNames = new ArrayList<>();
        FileReader reader = new FileReader(filePath);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);

        for (CSVRecord record : records) {
            productNames.add(record.get("Product"));
        }
        return productNames;
    }
}

package Tests;

import Utils.CSVReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CSVTest {

    @Test
    public void testProductNames() throws IOException {
        List<String> productNames = CSVReader.readProductNames("src/еуые/resources/Products.csv");
        assertTrue(productNames.contains("Hummingbird printed t-shirt"));
        assertTrue(productNames.contains("HUMMINGBIRD PRINTED SWEATER"));
    }
}

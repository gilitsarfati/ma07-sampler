package workspace.sampler;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsvReaderTests {
    public static List<TestDetails> readTestsFromCSV(String fileName) {
        List<TestDetails> tests = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                TestDetails test = createTest(attributes);
                tests.add(test);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return tests;
    }

    private static TestDetails createTest(String[] metadata) throws ParseException {
        int mdaCode = Integer.parseInt(metadata[0]);
        int idNum = Integer.parseInt(metadata[1]);
        IDTypes idType = IDTypes.valueOf(metadata[2]);
        String firstName = metadata[3];
        String lastName = metadata[4];
        String city = metadata[5];
        String street = metadata[6];
        int buildingNumber = Integer.parseInt(metadata[7]);
        String barcode = metadata[8];
        Date getDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[9]);
        Date takeDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[10]);
        Date resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[11]);
        return new TestDetails(mdaCode, idNum, idType, firstName, lastName, city, street, buildingNumber, barcode, getDate, takeDate, resultDate);
    }
}

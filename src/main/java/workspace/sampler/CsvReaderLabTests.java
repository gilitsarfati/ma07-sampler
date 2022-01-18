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

public class CsvReaderLabTests implements CsvReader {
    @Override
    public List read(String fileName) {
        List<LabTestDetails> labTests = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                LabTestDetails labTest = createLabTest(attributes);
                labTests.add(labTest);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return labTests;
    }

    private static LabTestDetails createLabTest(String[] metadata) throws ParseException {
        int idNum = Integer.parseInt(metadata[0]);
        int idType = Integer.parseInt(metadata[1]);
        String firstName = metadata[2];
        String lastName = metadata[3];
        Date resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[4]);
        Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[5]);
        int labCode = Integer.parseInt(metadata[6]);
        int stickerNumber = Integer.parseInt(metadata[7]);
        int resultTestCorona = Integer.parseInt(metadata[8]);
        String variant = metadata[9];
        String testType = metadata[10];

        return new LabTestDetails(idNum, idType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, resultTestCorona, variant, testType);
    }
}

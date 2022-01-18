package workspace.sampler;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddingColumns {
    public void appendCol(String fileName) {
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
        CsvReaderLabTests csvReaderLabTests = new CsvReaderLabTests();
        List<LabTestDetails> labTests = csvReaderLabTests.read(fileName);
        String output = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                PersonInsured personInsured = healthCareInfoProvider.fetchInfo(labTests.get(i).idNum, labTests.get(i).getIdTypeNumber());
                output += (String.valueOf(labTests.get(i)) + personInsured.getJoinDate() + personInsured.getHealthCareId() + personInsured.getHealthCareName());
                i++;
            }
            br.close();
            FileWriter fw = new FileWriter(fileName, false);
            fw.write(output);
            fw.flush();
            fw.close();
        } catch (InvalidIdException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

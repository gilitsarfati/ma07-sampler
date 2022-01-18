package workspace.sampler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;

public class TestsListToJson implements ObjectToJson{

    @Override
    public void convertObjToJson() throws IOException {
        CsvReaderTests csvReaderTests = new CsvReaderTests();
        List<TestDetails> testsList = csvReaderTests.read("MadaReports.csv");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        int size = testsList.size();
        int a = 0;
        int numOfFiles;
        if (size % 50000 == 0) {
            numOfFiles = size / 50000;
        } else {
            numOfFiles = (size / 50000) + 1;
        }
        for (int j = 1; j <= numOfFiles; j++) {
            JSONObject json = new JSONObject();
            if ((size - a) > 50000) {
                for (int i = 0; i < 50000; i++) {
                    json.put("test: ", testsList.get(i));
                }
                a += 50000;
                objectMapper.writeValue(new File("MadaReports"+ j + ".json"), json);
            }
            else{
                for (int i = 0; i < (size - a); i++) {
                    json.put("test: ", testsList.get(i));
                }
                objectMapper.writeValue(new File("MadaReports"+ j + ".json"), json);
            }
        }
    }
}

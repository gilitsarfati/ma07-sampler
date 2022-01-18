package workspace.sampler;

import java.util.List;

public class LabTestListToXml implements ObjectToXml {
    @Override
    public void convertObjToXml() {
        CsvAfterAddingColumns csvAfterAddingColumns = new CsvAfterAddingColumns();
        List list = csvAfterAddingColumns.readAfterAdding("LabTests.csv");
        String xmlData = "";
        xmlData = xmlData + "<?xml version=\"1.0\"?>\n" + "<labTests>\n";
        for (int i = 0; i < list.size(); i++) {
            xmlData = xmlData + "<labTest>\n" + list.get(i) + "<\n/labTest>\n";
        }
        xmlData = xmlData + "</labTests>";
    }
}

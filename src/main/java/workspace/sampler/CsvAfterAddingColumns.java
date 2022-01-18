package workspace.sampler;

import java.util.List;

public class CsvAfterAddingColumns {
    public void addingCol(String fileName){
        AddingColumns addingColumns = new AddingColumns();
        addingColumns.appendCol(fileName);
    }

    public List readAfterAdding(String fileName){
        CsvReaderLabTests csvReaderLabTests = new CsvReaderLabTests();
        addingCol(fileName);
        return csvReaderLabTests.read(fileName);
    }
}

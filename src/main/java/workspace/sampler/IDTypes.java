package workspace.sampler;

public enum IDTypes {
    BLUEID(0),
    PASSPORT(1),
    HMOMEMBERNUMBER(2);

    int value;
    IDTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

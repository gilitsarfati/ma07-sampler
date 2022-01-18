package workspace.sampler;

public enum ResultsTestCorona {
    NEGATIVE(0),
    POSITIVE(1),
    BORDERLINE(2),
    UNTESTED(3);

    int value;
    ResultsTestCorona(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package workspace.sampler;

import java.util.Date;

public class LabTestDetails {
    int idNum;
    IDTypes idType;
    String firstName;
    String lastName;
    Date resultDate;
    Date birthDate;
    int labCode;
    int stickerNumber;
    ResultsTestCorona resultTestCorona;
    String variant;
    String testType;

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public IDTypes getIdType() {
        return idType;
    }

    public void setIdType(IDTypes idType) {
        this.idType = idType;
    }

    public int getIdTypeNumber() {
        IDTypes idType = getIdType();
        return idType.getValue();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getLabCode() {
        return labCode;
    }

    public void setLabCode(int labCode) {
        this.labCode = labCode;
    }

    public int getStickerNumber() {
        return stickerNumber;
    }

    public void setStickerNumber(int stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public ResultsTestCorona getResultTestCorona() {
        return resultTestCorona;
    }

    public void setResultTestCorona(ResultsTestCorona resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    public int getResultsTestCoronaNumber() {
        ResultsTestCorona resultsTestCorona = getResultTestCorona();
        return resultsTestCorona.getValue();
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public LabTestDetails(int idNum, int idType, String firstName, String lastName,
                          Date resultDate, Date birthDate, int labCode,
                          int stickerNumber, int resultTestCorona,
                          String variant, String testType) {
        this.idNum = idNum;
        this.idType.value = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona.value = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }
}

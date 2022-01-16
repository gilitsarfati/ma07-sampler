package workspace.sampler;

import java.util.Date;

public class TestDetails {
    int mdaCode;
    int idNum;
    IDTypes idType;
    String firstName;
    String lastName;
    String city;
    String street;
    int buildingNumber;
    String barcode;
    Date getDate;
    Date takeDate;
    Date resultDate;

    public int getMdaCode() {
        return mdaCode;
    }

    public void setMdaCode(int mdaCode) {
        this.mdaCode = mdaCode;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int IDNum) {
        this.idNum = IDNum;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    public TestDetails(int mdaCode, int IDNum, IDTypes idType, String firstName,
                       String lastName, String city, String street, int buildingNumber,
                       String barcode, Date getDate, Date takeDate, Date resultDate) {
        this.mdaCode = mdaCode;
        this.idNum = IDNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }
}

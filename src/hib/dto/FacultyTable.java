package hib.dto;

public class FacultyTable 
{
    private String faName;
    private String faID;
    private String faPassword;
    private String faDepartment;
    private String faSubject;
    private String faContactNO;
    private String faEmailID;
    private String address;
    private String DOB;

    public FacultyTable() {
    }

    public FacultyTable(String faName, String faID, String faPassword, String faDepartment, String faSubject, String faContactNO, String faEmailID, String address, String DOB) {
        this.faName = faName;
        this.faID = faID;
        this.faPassword = faPassword;
        this.faDepartment = faDepartment;
        this.faSubject = faSubject;
        this.faContactNO = faContactNO;
        this.faEmailID = faEmailID;
        this.address = address;
        this.DOB = DOB;
    }

    public String getFaName() {
        return faName;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public String getFaID() {
        return faID;
    }

    public void setFaID(String faID) {
        this.faID = faID;
    }

    public String getFaPassword() {
        return faPassword;
    }

    public void setFaPassword(String faPassword) {
        this.faPassword = faPassword;
    }

    public String getFaDepartment() {
        return faDepartment;
    }

    public void setFaDepartment(String faDepartment) {
        this.faDepartment = faDepartment;
    }

    public String getFaSubject() {
        return faSubject;
    }

    public void setFaSubject(String faSubject) {
        this.faSubject = faSubject;
    }

    public String getFaContactNO() {
        return faContactNO;
    }

    public void setFaContactNO(String faContactNO) {
        this.faContactNO = faContactNO;
    }

    public String getFaEmailID() {
        return faEmailID;
    }

    public void setFaEmailID(String faEmailID) {
        this.faEmailID = faEmailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    
}
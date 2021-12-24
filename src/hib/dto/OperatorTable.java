package hib.dto;

public class OperatorTable 
{
    private String opName;
    private String opId;
    private String opPassword;
    private String opContactNo;
    private String opMailId;

    public OperatorTable() 
    {
        
    }

    public OperatorTable(String opName, String opId, String opPassword, String opContactNo, String opMailId) {
        this.opName = opName;
        this.opId = opId;
        this.opPassword = opPassword;
        this.opContactNo = opContactNo;
        this.opMailId = opMailId;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getOpPassword() {
        return opPassword;
    }

    public void setOpPassword(String opPassword) {
        this.opPassword = opPassword;
    }

    public String getOpContactNo() {
        return opContactNo;
    }

    public void setOpContactNo(String opContactNo) {
        this.opContactNo = opContactNo;
    }

    public String getOpMailId() {
        return opMailId;
    }

    public void setOpMailId(String opMailId) {
        this.opMailId = opMailId;
    }

    
}

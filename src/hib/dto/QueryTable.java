package hib.dto;

public class QueryTable 
{
    private int SerialNo;
    private String stuName;
    private String FaName;
    private String query;
    private String requestDate;
    private String to;
    private String from;
    private String status;

    public QueryTable() {
    }

    public QueryTable(int SerialNo, String stuName, String FaName, String query, String requestDate, String to, String from, String status) {
        this.SerialNo = SerialNo;
        this.stuName = stuName;
        this.FaName = FaName;
        this.query = query;
        this.requestDate = requestDate;
        this.to = to;
        this.from = from;
        this.status = status;
    }

    public QueryTable(String stuName, String FaName, String query, String requestDate, String to, String from, String status) 
    {
        this.stuName = stuName;
        this.FaName = FaName;
        this.query = query;
        this.requestDate = requestDate;
        this.to = to;
        this.from = from;
        this.status = status;
    }

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getFaName() {
        return FaName;
    }

    public void setFaName(String FaName) {
        this.FaName = FaName;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}

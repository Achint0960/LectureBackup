package hib.dto;

public class StudentTable 
{
    private String stuID;
    private String stuName;
    private String stuPassword;
    private String dob;
    private String stuCourse;
    private String stuSection;
    private String stuYear;
    private String stuContactNO;

    public StudentTable() 
    {
        
    }

    public StudentTable(String stuName, String stuID, String stuPassword, String dob, String stuCourse, String stuSection, String stuYear, String stuContactNO) 
    {
        this.stuName = stuName;
        this.stuID = stuID;
        this.stuPassword = stuPassword;
        this.dob = dob;
        this.stuCourse = stuCourse;
        this.stuSection = stuSection;
        this.stuYear = stuYear;
        this.stuContactNO = stuContactNO;
    }

    public String getStuContactNO() 
    {
        return stuContactNO;
    }

    public void setStuContactNO(String stuContactNO) 
    {
        this.stuContactNO = stuContactNO;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuID() 
    {
        return stuID;
    }

    public void setStuID(String stuID) 
    {
        this.stuID = stuID;
    }

    public String getStuPassword() 
    {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) 
    {
        this.stuPassword = stuPassword;
    }

    public String getDob() 
    {
        return dob;
    }

    public void setDob(String dob) 
    {
        this.dob = dob;
    }

    public String getStuCourse() 
    {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) 
    {
        this.stuCourse = stuCourse;
    }

    public String getStuSection() 
    {
        return stuSection;
    }

    public void setStuSection(String stuSection) 
    {
        this.stuSection = stuSection;
    }

    public String getStuYear() 
    {
        return stuYear;
    }

    public void setStuYear(String stuYear) 
    {
        this.stuYear = stuYear;
    }   
}
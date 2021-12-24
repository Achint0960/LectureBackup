package hib.dto;

public class NewsTable 
{
    private int SerialNo;
    private String name;
    private String caption;
    private String description;
    private String postDate;

    public NewsTable() {
    }

    public NewsTable(String name, String caption, String description, String postDate) {
        this.name = name;
        this.caption = caption;
        this.description = description;
        this.postDate = postDate;
    }

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}

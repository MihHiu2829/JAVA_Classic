package OOP_5;

public class writer {
    private String Name;
    private Date date ;

    public writer(String name, Date date) {
        Name = name;
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

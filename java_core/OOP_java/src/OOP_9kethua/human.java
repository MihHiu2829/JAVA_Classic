package OOP_9kethua;

public class human {
    private String name ;
    private int date  ;

    public human(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public void eat(){
        System.out.println("Nhmz Nhmz");
    }
    public void drink(){
        System.out.println("Uc Uc");
    }
    public void sleep(){
        System.out.println("zz zz zz");
    }
}

package OOP_6;

public class edition {
    private String name ;
    private String national ;
    public edition(String name, String national) {
        this.name = name;
        this.national = national;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
}

package OOP_7;

public class Class {
    private String name ;
    private String nameGruop  ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameGruop() {
        return nameGruop;
    }

    public void setNameGruop(String nameGruop) {
        this.nameGruop = nameGruop;
    }

    public Class(String name, String nameGruop) {
        this.name = name;
        this.nameGruop = nameGruop;
    }
}

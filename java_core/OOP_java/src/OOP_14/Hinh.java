package OOP_14;

public abstract class Hinh {
    protected toaDo toaDo ;

    public OOP_14.toaDo getToaDo() {
        return toaDo;
    }
    public void setToaDo(OOP_14.toaDo toaDo) {
        this.toaDo = toaDo;
    }

    public Hinh(OOP_14.toaDo toaDo) {
        this.toaDo = toaDo;
    }
    public abstract double dientich();
}

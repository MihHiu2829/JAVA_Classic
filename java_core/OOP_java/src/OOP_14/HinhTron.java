package OOP_14;

public class HinhTron extends Hinh{
    private double bankinh ;
    public HinhTron(OOP_14.toaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double dientich() {
        return Math.PI*this.bankinh*this.bankinh ;
    }

    public HinhTron(OOP_14.toaDo toaDo, double bankinh) {
        super(toaDo);
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
}

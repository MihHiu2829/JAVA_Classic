package OOP_14;

public class HinhChuNhat extends Hinh {
    private double chieurong, chieucao ;

    public HinhChuNhat(OOP_14.toaDo toaDo, double chieurong, double chieucao) {
        super(toaDo);
        this.chieurong = chieurong;
        this.chieucao = chieucao;
    }

    @Override
    public double dientich() {
        return this.chieucao*this.chieurong ;
    }
}

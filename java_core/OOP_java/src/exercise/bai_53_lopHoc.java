package exercise;

public class bai_53_lopHoc {
    private String maLop ;
    private String tenLop ;
    private int siSo  ;

    public bai_53_lopHoc() {
    }

    public bai_53_lopHoc(String maLop, String tenLop, int siSo) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
}

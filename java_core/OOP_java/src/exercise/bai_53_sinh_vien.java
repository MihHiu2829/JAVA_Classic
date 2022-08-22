package exercise;

public class bai_53_sinh_vien {
    private String MSSV  ;
    private String hoVaTen ;
    private int namSinh ;
    private String maLop ;

    @Override
    public String toString() {
        return "bai_53_sinh_vien{" +
                "MSSV='" + MSSV + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", maLop='" + maLop + '\'' +
                '}';
    }

    public bai_53_sinh_vien(String MSSV, String hoVaTen, int namSinh, String maLop) {
        this.MSSV = MSSV;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.maLop = maLop;
    }
    public String getMSSV() {
        return MSSV;
    }
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
}

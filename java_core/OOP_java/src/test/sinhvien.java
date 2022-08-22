package test;

public class sinhvien implements Comparable<sinhvien> {
    private int maSinhVien ;
     private String hoTen , lop ;
     private double diemtrungbinh ;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public sinhvien(int maSinhVien, String hoTen, String lop, double diemtrungbinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemtrungbinh = diemtrungbinh;
    }

    @Override
    public int compareTo(sinhvien o) {
        String tenthis = "" ;
        String ten0 = "" ;
        return this.maSinhVien -o.maSinhVien  ;
    }
}

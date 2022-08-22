package Array_List_04;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private int NamSinh ;
    private String HoVaTen ;
    private String MaSinhVien ;
    private float DiemTrungBinh ;

    public SinhVien(int namSinh, String hoVaTen, String maSinhVien, float diemTrungBinh) {
        NamSinh = namSinh;
        HoVaTen = hoVaTen;
        MaSinhVien = maSinhVien;
        DiemTrungBinh = diemTrungBinh;
    }
    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public float getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public SinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "NamSinh=" + NamSinh +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", MaSinhVien='" + MaSinhVien + '\'' +
                ", DiemTrungBinh=" + DiemTrungBinh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(MaSinhVien, sinhVien.MaSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaSinhVien);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.MaSinhVien.compareTo(o.MaSinhVien) ;
    }
}

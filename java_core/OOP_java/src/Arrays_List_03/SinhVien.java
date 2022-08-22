package Arrays_List_03;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String hoVaTen ;
    private String maSinhVien ;
    private int namSinh  ;
    private float diem ;

    public SinhVien(String hoVaTen, String maSinhVien, int namSinh, float diem) {
        this.hoVaTen = hoVaTen;
        this.maSinhVien = maSinhVien;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", namSinh=" + namSinh +
                ", diem=" + diem +
                '}';
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien) ;
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SinhVien)) return false;
//        SinhVien sinhVien = (SinhVien) o;
//        return Objects.equals(getMaSinhVien(), sinhVien.getMaSinhVien());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSinhVien, sinhVien.maSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien);
    }
}

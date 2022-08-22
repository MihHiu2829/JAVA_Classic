package Array_list_02;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien ;
    private String hoVaten  ;
    private int  namSinh  ;
    private float diem ;

    public SinhVien(String maSinhVien, String hoVaten, int namSinh, float diem) {
        this.maSinhVien = maSinhVien;
        this.hoVaten = hoVaten;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaten='" + hoVaten + '\'' +
                ", namSinh=" + namSinh +
                ", diem=" + diem +
                '}';
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
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

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien) ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinhVien)) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(getMaSinhVien(),
                sinhVien.getMaSinhVien());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMaSinhVien());
    }
}

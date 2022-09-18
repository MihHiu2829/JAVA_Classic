package File_tutorial_4;

import java.io.Serializable;
import java.util.Objects;

public class sinhvien implements Comparable<sinhvien>, Serializable {
    private String ten ;
    private String lop ;
    private String id  ;
    private float diem ;

    public sinhvien(String id) {
        this.id = id;
    }

    public sinhvien(String ten, String lop, String id, float diem) {
        this.ten = ten;
        this.lop = lop;
        this.id = id;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "sinhvien{" +
                "ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                ", id='" + id + '\'' +
                ", diem=" + diem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        sinhvien sinhvien = (sinhvien) o;
        return Objects.equals(id, sinhvien.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(sinhvien o) {
        return this.id.compareTo(o.id);
    }
}

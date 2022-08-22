package File_tutorial_3;

import java.io.Serializable;

public class sinhvien implements Comparable<sinhvien>, Serializable {
    private String Ten ;
    private String DiaCHi ;
    private String lop ;
    private float marks  ;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaCHi() {
        return DiaCHi;
    }

    public sinhvien(String lop) {
        this.lop = lop;
    }

    public void setDiaCHi(String diaCHi) {
        DiaCHi = diaCHi;
    }

    @Override
    public String toString() {
        return "sinhvien{" +
                "Ten='" + Ten + '\'' +
                ", DiaCHi='" + DiaCHi + '\'' +
                ", lop='" + lop + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public sinhvien(String ten, String diaCHi, String lop, float marks) {
        Ten = ten;
        DiaCHi = diaCHi;
        this.lop = lop;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof sinhvien)) return false;

        sinhvien sinhvien = (sinhvien) o;

        if (Float.compare(sinhvien.getMarks(), getMarks()) != 0) return false;
        if (getTen() != null ? !getTen().equals(sinhvien.getTen()) : sinhvien.getTen() != null) return false;
        if (getDiaCHi() != null ? !getDiaCHi().equals(sinhvien.getDiaCHi()) : sinhvien.getDiaCHi() != null)
            return false;
        return getLop() != null ? getLop().equals(sinhvien.getLop()) : sinhvien.getLop() == null;
    }

    @Override
    public int hashCode() {
        int result = getTen() != null ? getTen().hashCode() : 0;
        result = 31 * result + (getDiaCHi() != null ? getDiaCHi().hashCode() : 0);
        result = 31 * result + (getLop() != null ? getLop().hashCode() : 0);
        result = 31 * result + (getMarks() != +0.0f ? Float.floatToIntBits(getMarks()) : 0);
        return result;
    }

    @Override
    public int compareTo(sinhvien o) {
        return this.getLop().compareTo(o.getLop()) ;
    }
}

package ARRAY_LIST;

public class Sinh_Vien implements Comparable {
    private String maSinhVien  ;
    private String hoVaTen ;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Sinh_Vien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    private int namSinh ;
    private float diemTrungBinh  ;

    public Sinh_Vien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Sinh_Vien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
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

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    public int compareTo(Sinh_Vien o) {
        return this.maSinhVien.compareTo(o.maSinhVien) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sinh_Vien sinhVien = (Sinh_Vien) o;

        if (namSinh != sinhVien.namSinh) return false;
        if (Float.compare(sinhVien.diemTrungBinh, diemTrungBinh) != 0) return false;
        if (maSinhVien != null ? !maSinhVien.equals(sinhVien.maSinhVien) : sinhVien.maSinhVien != null) return false;
        return hoVaTen != null ? hoVaTen.equals(sinhVien.hoVaTen) : sinhVien.hoVaTen == null;
    }

    @Override
    public int hashCode() {
        int result = maSinhVien != null ? maSinhVien.hashCode() : 0;
        result = 31 * result + (hoVaTen != null ? hoVaTen.hashCode() : 0);
        result = 31 * result + namSinh;
        result = 31 * result + (diemTrungBinh != +0.0f ? Float.floatToIntBits(diemTrungBinh) : 0);
        return result;
    }
}

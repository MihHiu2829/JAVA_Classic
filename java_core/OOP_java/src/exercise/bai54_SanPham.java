package exercise;

import java.util.Objects;

public class bai54_SanPham implements Comparable<bai54_SanPham>{
    private String maSanPham ;
    private String tenSanPham ;
    private int giaCa ;
    private String xuatXu ;

    public bai54_SanPham(String maSanPham, String tenSanPham, int giaCa, String xuatXu) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaCa = giaCa;
        this.xuatXu = xuatXu;
    }

    public bai54_SanPham() {

    }

    public bai54_SanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    @Override
    public String toString() {
        return "bai54_SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaCa=" + giaCa +
                ", xuatXu='" + xuatXu + '\'' +
                '}';
    }
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    public int getGiaCa() {
        return giaCa;
    }
    public void setGiaCa(int giaCa) {
        this.giaCa = giaCa;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public int compareTo(bai54_SanPham o) {
        return this.maSanPham.compareTo(o.maSanPham) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bai54_SanPham that = (bai54_SanPham) o;
        return Objects.equals(maSanPham, that.maSanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSanPham);
    }
}

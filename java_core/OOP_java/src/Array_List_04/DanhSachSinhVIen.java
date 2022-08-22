package Array_List_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVIen {
    private ArrayList<SinhVien>danhsach  ;

    public DanhSachSinhVIen(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVIen() {
        this.danhsach = new ArrayList<SinhVien>() ;
    }
    public void ThemSinhVien(SinhVien sv){
        this.danhsach.add(sv) ;
    }
    public void InSinhVien(){
        for (SinhVien sinhvien: danhsach
             ) {
            System.out.println(sinhvien);
        }
    }
    public boolean KiemTraDanhSachRong(){
        return this.danhsach.isEmpty()   ;
    }
    public int SoLuongSinhVienTrongDanhSach(){
        return this.danhsach.size() ;
    }
    public void xoaDanhSach(){
        this.danhsach.removeAll(danhsach) ;
    }
    public boolean ktraSinhVienTonTai(SinhVien sv){
        return this.danhsach.contains(sv) ;
    }
    public boolean xoa1svrakhoiDanhSach(SinhVien sv)
    {
        return this.danhsach.remove(sv) ;
    }
    public void TimKiemduatheoTen(String ten){
        for (SinhVien sinhVien :
                danhsach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0 )
                System.out.println(sinhVien);
        }
    }
    public void SapSepdanhsachsinhvientheodiemtuthapdencao(){
        Collections.sort(danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh() ) return 1 ;
                if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh() ) return -1 ;
              return 0 ;
            }
        });
    }
}





































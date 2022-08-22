package Arrays_List_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhsach ;

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        this.danhsach.add(sv) ;
    }
    public void InSinhVien(){
        for (SinhVien sinhvien : danhsach
             ) {
            System.out.println(sinhvien);
        }
    }
    public boolean ktraDanhSachRong(){
        return this.danhsach.isEmpty();
    }
    public int soluongsinhvien(){
        return this.danhsach.size()  ;
    }
    public void xoaDanhSach(){
        this.danhsach.removeAll(danhsach) ;
    }
    public boolean ktrasinhvientontai(SinhVien sv){
        return this.danhsach.contains(sv) ;
    }
    public boolean xoa1sinhvienrakhoidanhsach(SinhVien sv){
        return this.danhsach.remove(sv) ;
    }
    public void xuatdanhsachcodiemgiamdan(){
        Collections.sort(danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiem() > o2.getDiem()) return 1 ;
                if(o1.getDiem() < o2.getDiem()) return -1 ;
                      return 0 ;
            }
        });
    }
    public void timkiemsinhvienthongquaTen(String ten){
        for (SinhVien sinhvien: danhsach
             ) {
            if(sinhvien.getHoVaTen().indexOf(ten) >= 0)
                System.out.println(sinhvien);
        }
    }
}

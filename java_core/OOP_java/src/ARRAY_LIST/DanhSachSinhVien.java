package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Sinh_Vien>danhsach  ;

    public DanhSachSinhVien(ArrayList<Sinh_Vien> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<Sinh_Vien>() ;
    }
    public void themSinhVien(Sinh_Vien sv){
        this.danhsach.add(sv) ;
    }

    @Override
    public String toString() {
        return "DanhSachSinhVien{" +
                "danhsach=" + danhsach +
                '}';
    }

    public void inDanhSach(){
        for ( Sinh_Vien sinhvien : danhsach
             ) {
            System.out.println(sinhvien.toString());
        }
    }
    public boolean ktradanhsachRong(){
        return this.danhsach.isEmpty() ;
    }
    public int soluongSinhVien(){
        return this.danhsach.size() ;
    }
    public void LamRongDanhSach(){
        this.danhsach.removeAll(danhsach) ;
    }
    // Câu 6
    public boolean ktraTonTai(Sinh_Vien sv)
    {
        return this.danhsach.contains(sv) ;
    }
    // cau 7
    public boolean xoaSinhVien(Sinh_Vien sv){
        return this.danhsach.remove(sv) ;
    }
    // cau 8
    public void timSinhVien(String ten) {
        for (Sinh_Vien sinhVien : danhsach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            } else
                System.out.println("Khong tim thay");
        }

    }
    public void sapXepSinhViengiamdantheodiem(){
        Collections.sort(danhsach, new Comparator<Sinh_Vien>() {
            @Override
            public int compare(Sinh_Vien o1, Sinh_Vien o2) {
                if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh())
                     return 1   ;
                else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh())
                return -1 ;
                return 0  ;
            }
        });
    }
}

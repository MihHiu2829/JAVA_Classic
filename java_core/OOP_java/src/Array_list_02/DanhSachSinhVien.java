package Array_list_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
      private ArrayList<SinhVien>danhSach ;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>() ;
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
   public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv) ;
   }
   public void indanhsach(){
       for (SinhVien sinhvien : danhSach
            ) {
           System.out.println(sinhvien.toString());
       }
   }
   public boolean ktraDanhSachRong(){
        return this.danhSach.isEmpty()  ;
   }
   public int Soluongsinhvien(){
        return danhSach.size() ;
   }
   public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach) ;
   }
   public boolean ktratontai(SinhVien sv)
   {
       return this.danhSach.contains(sv) ;
   }
   // 7 xoa sinh vien
   public boolean xoaSinhVien(SinhVien sv)
   {
       return this.danhSach.remove(sv) ;
   }
   // 8 tim kiem tat ca sinh vien dua theo ten nhap tu ban phim ;
    public void timSinhVien(String ten)
    {
        for (SinhVien sinhvien : danhSach
             ) {
            if(sinhvien.getHoVaten().indexOf(ten) >= 0)
            {
                System.out.println(sinhvien);
            }
        }
    }
    //9 sap xep sinh vien giam dan theo diem:
    public  void sapSepSinhVenGiamDanTheoDiem(){
               Collections.sort(danhSach, new Comparator<SinhVien>() {
                   @Override
                   public int compare(SinhVien o1, SinhVien o2) {
                       if(o1.getDiem() < o2.getDiem())
                            return 1 ;
                       if(o1.getDiem() > o2.getDiem())
                                       return -1 ;
                       return 0;
                   }
               });
    }
}

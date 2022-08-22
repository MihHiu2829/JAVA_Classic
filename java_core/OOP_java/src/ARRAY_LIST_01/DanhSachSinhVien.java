package ARRAY_LIST_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhsach ;  // trong cap ngoac la kieu du liẹu nguoi dung, ben phai la ten kieu du lieu array líst

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>() ;
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }
    public void themSinhVIen(SinhVien sv)
    {
        this.danhsach.add(sv);
    }
    public void inDanhSach()
    {
        for ( SinhVien sinhVien : danhsach
              ) {
            System.out.println(sinhVien.toString());
        }
    }
    public boolean ktraDanhSachRong(){
        return danhsach.isEmpty() ;
    }
    public int laysoluongsinhvie(){
        return danhsach.size() ;
    }
    public void lamRongDanhSach(){
        danhsach.removeAll(danhsach) ;
    }
    public boolean ktraSinhViencotontai(SinhVien sv)
    {
        return this.danhsach.contains(sv);   // tim hieu ve tu khoa contains !
    }
    // cau 7 xoa 1 sinh vien ra khoi danh sach
    public boolean xoaSinhVien(SinhVien sv)
    {
        return this.danhsach.remove(sv);
    }
    // cau 8 :
    public void timSinhVien(String ten)
    {
        for(SinhVien sinhVien : danhsach){
            if(sinhVien.getHoVaTen().indexOf(ten) >=0 )
            {
                System.out.println(sinhVien);
            }else System.out.println("Khong tim thay");
        }
    }
    // cau 9: sap sep dam dan theo diem !
    public void sapXepSinhVienGiamDanTheoDiem(){

        Collections.sort(danhsach, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh())
                return 1 ;
                else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh())
                     return -1 ;
                return 0  ;
            }
            @Override
            public boolean equals(Object obj) {
                return false;
            }
        }) ;
    }
}

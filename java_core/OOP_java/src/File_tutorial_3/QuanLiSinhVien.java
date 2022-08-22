package File_tutorial_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLiSinhVien {
    private ArrayList <sinhvien> danhsach ;

    public QuanLiSinhVien() {
        this.danhsach  = new ArrayList<sinhvien>() ;
    }

    public void them1sinhvien(sinhvien a){
        danhsach.add(a) ;
    }
    public void Indanhsachsinhvien(){
        for(sinhvien a : danhsach){
            System.out.println(a);
        }
    }
    public boolean ktraDanhSachRong(){
        return this.danhsach.isEmpty() ;
    }
    public int laySoLuong(){
        return this.danhsach.size();
    }
    public void lamRongDanhSach(){
        this.danhsach.clear();
    }
    public boolean kiemtratontaithongqaLopHoc(sinhvien a){
           return this.danhsach.contains(a) ;
    }
    public boolean xoa1SV(sinhvien a){
        return this.danhsach.remove(a) ;
    }
    public void timKiemSinhVien(String ten){
        for(sinhvien a : danhsach){
            if(a.getTen().compareTo(ten) == 0 )  {
                System.out.println(a);
            }
        }
    }
    public void sapXepgiamtheoDiem(){
        Collections.sort(danhsach, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien o1, sinhvien o2) {
                if(o1.getMarks() < o2.getMarks())
                    return 1 ;
                if(o1.getMarks() > o2.getMarks())
                    return -1 ;
                return 0;
            }
        });
    }
    //10 ghi xuong file
    public void ghiDuLieuXuongFIle(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os) ;
            for(sinhvien a : danhsach){
                oos.writeObject(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // 11 doc thong tin tu file
    public void docDuLieutuFile(File file){
        try {
            InputStream is = new FileInputStream(file) ;
            ObjectInputStream ois = new ObjectInputStream(is) ;
               sinhvien tmp = null ;
               while(true){
                   tmp =  (sinhvien) ois.readObject();
                   if(tmp == null) break ;
                   danhsach.add(tmp) ;
               }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

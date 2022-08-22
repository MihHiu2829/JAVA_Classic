package File_tutorial_4;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    ArrayList<sinhvien> danhsach ;

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<sinhvien>();
    }
     public void ThemSV(sinhvien sv){
        this.danhsach.add(sv) ;
     }
     public void InSV(){
        for(sinhvien a : danhsach){
            System.out.println(a);
        }
     }
     public boolean KtradssvRong(){
        return this.danhsach.isEmpty() ;
     }
     public int laySoLuong(){
        return this.danhsach.size() ;
     }
     public boolean LamRong(){
        return this.danhsach.removeAll(this.danhsach);
     }
     public boolean ktraTonTai(sinhvien a){
        return this.danhsach.contains(a) ;
     }
     public boolean xoa1Sv(sinhvien a){
        return this.danhsach.remove(a) ;
     }
     public void timKiem(String ten){
          for(sinhvien a: danhsach){
              if(a.getTen().compareTo(ten) == 0) {
                  System.out.println(a);
              }
          }
     }
     public void sort(){
         Collections.sort(danhsach, new Comparator<sinhvien>() {
             @Override
             public int compare(sinhvien o1, sinhvien o2) {
                   if(o1.getDiem() < o2.getDiem()) return 1  ;
                   if (o1.getDiem() > o2.getDiem()) return -1 ;
                   return 0   ;
              }
         });
     }
     public void GhiDuLieuXuongFile(File file){
         try {
             OutputStream os = new FileOutputStream(file) ;
             ObjectOutputStream oos = new ObjectOutputStream(os);
             for(sinhvien a : danhsach){
                 oos.writeObject(a);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
     public void DocDuLieuRa(File file){
         try {
             InputStream is = new FileInputStream(file) ;
             ObjectInputStream ois = new ObjectInputStream(is);
             sinhvien a = null   ;
             while(true){
                 a =  (sinhvien) ois.readObject()  ;
                 if(a==null) break  ;
                 danhsach.add(a) ;
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
     }

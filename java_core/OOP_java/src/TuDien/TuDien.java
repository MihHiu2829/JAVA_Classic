package TuDien;

import java.sql.SQLOutput;
import java.util.*;

public class TuDien {
    private Map<String, String > data = new TreeMap<String,String>() ;
    public void themTuDien(String key,String values){
        this.data.put(key,values) ;
    }
    public String xoaTu(String keyWord){
        return this.data.remove(keyWord) ;
    }
    public String findMean(String keyword){
        String ketQua = this.data.get(keyword) ;
        return ketQua ;
    }
    public void inTuKoa(){
        Set<String> tahoptukhoa = this.data.keySet();
        System.out.println(Arrays.toString(tahoptukhoa.toArray())) ;
    }
    public int laySoLuong(){
        return this.data.size() ;
    }
    public void xoaTatCa(){
        this.data.clear();
    }

    public static void main(String[] args) {
        TuDien td = new TuDien() ;
        int luachon = 0  ;
        Scanner sc = new Scanner(System.in) ;
        do{
            System.out.println("=====================");
            System.out.println("1. them tu khoa, y nghia cua tu");
            System.out.println("2. Xoa tu");
            System.out.println("3.tim y nghia cua tu khoa-tr tu");
            System.out.println("4. in ra danh sach tu khoa");
            System.out.println("5. In ra so luong tu");
            System.out.println("6. Xoa tat ca cac tu khoa");
            System.out.println("0. thoat");
            luachon = sc.nextInt() ;
            sc.nextLine() ;
            if(luachon == 1){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine() ;
                System.out.println("Nhap vao y nghia: ");
                String yNghia = sc.nextLine() ;
                td.themTuDien(tuKhoa,yNghia);
            }else if(luachon == 2 || luachon == 3)
            {
                System.out.println("Nhap vao tu khoa");
                String tuKhoa = sc.nextLine()  ;
                if(luachon==2) System.out.println(td.xoaTu(tuKhoa)) ;
                else {
                    System.out.println("Nghia cua tu la: "+ td.findMean(tuKhoa));
                }
            }else if(luachon == 4) td.inTuKoa();
            else if(luachon == 5) System.out.println("So luong tu khoa trong tu dien: "+ td.laySoLuong());
            else if (luachon == 6) {
                System.out.println("da xoa tat ca");
                td.xoaTatCa();
            }
        }while(luachon!=0);
    }
}

package SETTT;

import java.util.*;

public class Hashset_boc_tham_trung_thuong {
     private  Set<String>thungphieu = new TreeSet<String>();

  public boolean themPhieu(String giaTri){
      return this.thungphieu.add(giaTri);
  }
    public Hashset_boc_tham_trung_thuong() {
    }
   public boolean xoa1phieu(String giaTri){
      return this.thungphieu.remove(giaTri) ;
   }
   public boolean ktraPhieuCoTontai(String giaTri){
      return this.thungphieu.contains(giaTri) ;
   }
   public int xemSoLuongPhieu(){
       return this.thungphieu.size() ;
   }
   public void xoatatcaPhieu(){
      this.thungphieu.clear();
   }
   public void inTatCaPhieu(){
       System.out.println(Arrays.toString(this.thungphieu.toArray()));
   }
   public String boctham(){
      String ketQua = "" ;
       Random rd = new Random();
       int vitri = rd.nextInt(thungphieu.size());
       ketQua = (String) this.thungphieu.toArray()[vitri] ;
       return ketQua;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Hashset_boc_tham_trung_thuong rt = new Hashset_boc_tham_trung_thuong() ;
        int luachon =  0   ;
        do{
            System.out.println("Moi chon chuc nang: ");
            System.out.println("1. them mot la phieu.");
            System.out.println("2. xoa mot la phieu");
            System.out.println("3. Kiem tra la phieu co ton tai.");
            System.out.println("4. Xem so luong phieu.");
            System.out.println("5. xoa ton bo phieu.");
            System.out.println("6. In tat ca phieu");
            System.out.println("7. boc tham trung thuong.");
            System.out.println("0. thoat chuong trinh.");
            luachon = sc.nextInt() ;
            sc.nextLine() ;
            if(luachon == 1 || luachon == 2 || luachon == 3){
                System.out.println("Nhap la phieu: ");
                String giatri = sc.nextLine() ;
                if(luachon == 1)
                    System.out.println("Da them 1 la phieu: "+ rt.themPhieu(giatri)) ;
                if(luachon == 2)
                    System.out.println("Da xoa 1 la phieu: "+ rt.xoa1phieu(giatri));
                if(luachon == 3)
                    System.out.println("la phieu ban vua nhap ton tai: "+ rt.ktraPhieuCoTontai(giatri));
            }else if (luachon == 4) System.out.println("so luong la phieu trong thung: "+ rt.xemSoLuongPhieu());
            else if (luachon == 5) rt.xoatatcaPhieu();
            else if (luachon == 6) rt.inTatCaPhieu();
            else System.out.println("la phieu may man la: "+rt.boctham());
        }while(luachon != 0)  ;
    }
}

package OOP_19;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000 ;
        Scanner sc= new Scanner(System.in) ;
        Locale lc = new Locale("vi","VN") ;
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc) ;

        int luachon = 1 ;
        do{
            System.out.println("------------Moi ban lua chon-------------");
            System.out.println("chon (1) de tiep tuc choi. ");
            System.out.println("chon (0) de thoat. ");
            luachon = sc.nextInt() ;
            if(luachon == 1){
                System.out.println("--------Bat dau choi-------------");
                System.out.println("------Tai khoan cua ban: "+numf.format(taiKhoanNguoiChoi ) +", ban muon cuoc bao nhieu! ");
               double datcuoc =  0  ;
                do {
                    System.out.println("------dat cuoc (0<so tien cuoc= "+numf.format(taiKhoanNguoiChoi )+": ");
                    datcuoc = sc.nextDouble() ;
                }while(datcuoc <= 0 || datcuoc > taiKhoanNguoiChoi) ;
                 int luachontaixiu = 0 ;
                 do{
                     System.out.println("***** Chon: 1 <-> tai hoac 2 <-> xiu");
                     luachontaixiu = sc.nextInt() ;

                 }while(luachontaixiu!=1 && luachontaixiu !=2 ) ;
                 Random xucxac1 = new Random() ;
                Random xucxac2 = new Random() ;
                Random xucxac3 = new Random() ;
                int giatri1 = xucxac1.nextInt(5)+1  ;
                int giatri2 = xucxac2.nextInt(5)+1 ;
                int giatri3 = xucxac3.nextInt(5)+1 ;
                int tong = giatri1 + giatri2 + giatri3  ;
                // tinh toan ket qua:
                System.out.println("*****Ket qua: "+giatri1+" - "+giatri2+" - "+giatri3);
                if(tong==3 || tong==18){
                    System.out.println("*****Tong la:"+ tong +"=> nha cai an het, ban da thua! ");
                    taiKhoanNguoiChoi-=datcuoc   ;
                    System.out.println("*****Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi ));
                }else if (tong>=4 && tong <=10){
                    System.out.println("***** Tong la: "+tong+ " => Xiu");
                    if(luachontaixiu == 2){
                        taiKhoanNguoiChoi +=datcuoc ;
                        System.out.println("***** tai khoan cua ban la: "+ numf.format(taiKhoanNguoiChoi ));
                    }else{
                        System.out.println("***** ban da thua cuoc ");
                        taiKhoanNguoiChoi-= datcuoc ;
                        System.out.println("***** tai khoan cua ban la: "+ numf.format(taiKhoanNguoiChoi ));

                    }
                }else{
                    System.out.println("***** Tong la: "+tong+ " => tai");
                    if(luachontaixiu == 1){
                        taiKhoanNguoiChoi +=datcuoc ;
                        System.out.println("***** tai khoan cua ban la: "+ numf.format(taiKhoanNguoiChoi ));
                    }else{
                        System.out.println("***** ban da thua cuoc ");
                        taiKhoanNguoiChoi-= datcuoc ;
                        System.out.println("***** tai khoan cua ban la: "+ numf.format(taiKhoanNguoiChoi ));

                    }
                }
            }
        }while(luachon != 0 ) ;
    }
}

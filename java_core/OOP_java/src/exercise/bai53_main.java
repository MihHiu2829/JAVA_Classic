package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class bai53_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<bai_53_sinh_vien>danhsach = new ArrayList<bai_53_sinh_vien>() ;
        bai_53_lopHoc lop1 = new bai_53_lopHoc("A111","12a5",5) ;
        bai_53_lopHoc lop2 = new bai_53_lopHoc("A112","12a6",4) ;
        bai_53_lopHoc lop3 = new bai_53_lopHoc("A113","12a7",6) ;
        System.out.println("So luong sinh muon nhap: ");
        int n = sc.nextInt() ;
        sc.nextLine() ;
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thu: "+(i+1));
            System.out.println("Nhap ten sinh vien: "); String hoTen = sc.nextLine() ;
            System.out.println("Nhap ma sinh vien: "); String Masinhvien = sc.nextLine() ;
            System.out.println("Nhap lop sinh vien: "); String maLop = sc.nextLine() ;
            System.out.println("Nhap nam sinh sinh vien: "); int namSinh = sc.nextInt() ;
                  sc.nextLine();
            bai_53_sinh_vien sv = new bai_53_sinh_vien(Masinhvien,hoTen,namSinh,maLop) ;
            danhsach.add(sv) ;
        }
        String az = "12a5";
        System.out.println("Lop 12a5 co nhung sinh vien sau: ");
        for (bai_53_sinh_vien sv : danhsach) {
            if(sv.getMaLop().compareTo("12a5") == 0 )
                System.out.println(sv.toString());
        }
        System.out.println("Lop 12a6 co nhung sinh vien sau: ");
        for (bai_53_sinh_vien sv: danhsach
        ) {
            if(sv.getMaLop().compareTo("12a6") == 0)
                System.out.println(sv.getMaLop());
        }
        System.out.println("Lop 12a7 co nhung sinh vien sau: ");
        for (bai_53_sinh_vien sv: danhsach
        ) {
            if(sv.getMaLop().compareTo("12a7") == 0 )
                System.out.println(sv.toString());
        }
    }
}

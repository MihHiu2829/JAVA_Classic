package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bai54_main {
    public static void main(String[] args) {
        ArrayList<bai54_danhmuc> thongtindanhmuc = new ArrayList<bai54_danhmuc>();
        Scanner sc = new Scanner(System.in);
        int luachon ;
        do {
            System.out.println("Nhap chuc nang muon dung: ");
            System.out.println("1. nhap thong tin tong the.\n" + "2. Nhap ma danh muc de xuat thong tin danh muc\n" + "3.Cap nhat thong tin san pham.\n"
                    + "4. Liet ke san pham den tu trung quoc.\n"+"0. thoat.");
             luachon = sc.nextInt();
             if(luachon == 1){
                 System.out.println("Nhap ma danh muc: ");
                 int MadanhMuc = sc.nextInt() ;
                     sc.nextLine() ;
                 System.out.println("Nhap ten danh sach: ");
                 String Tendanhmuc = sc.nextLine();
                 bai54_danhmuc danhmuc = new bai54_danhmuc(MadanhMuc,Tendanhmuc) ;
                 System.out.println("Nhap so luong san pham ban muon them trong danh muc: ");
                 int soluong = sc.nextInt() ;
                 sc.nextLine()  ;
                 for(int i=0;i<soluong;i++){
                     System.out.println("san pham thu "+(i+1));
                     System.out.println("Nhap ma san pham: "); String maSanPham = sc.nextLine() ;
                     System.out.println("nhap ten san pham: "); String tenSanPham = sc.nextLine();
                     System.out.println("Nhap gia cua san pham: "); int giaCa = sc.nextInt()  ;
                     sc.nextLine() ;
                     System.out.println("Nhap xuat xu san pham: "); String suatXu = sc.nextLine() ;
                     bai54_SanPham sanPham = new bai54_SanPham(maSanPham,tenSanPham,giaCa,suatXu) ;
                     danhmuc.themSanPham(sanPham);
                 }
             }else if(luachon == 2){
                 sc.nextLine();
                 System.out.println("Vui long nhap ten danh muc: ");
                 String tenDanhMuc = sc.nextLine();
                  int flag = 0  ;
                 for (bai54_danhmuc danhmuc : thongtindanhmuc
                      ) {
                        if(danhmuc.getTenDanhMuc().indexOf(tenDanhMuc) == 0 ) {
                             danhmuc.xuatDanhSachSanPham();
                             flag = 1 ;
                        }
                     if(flag ==0 ) System.out.println("Khong co ten danh muc:"+ tenDanhMuc);
                 }
             }else if (luachon == 3){
                 sc.nextLine();
                 System.out.println("Vui long nhap ten danh muc: ");
                 String tenDanhMuc = sc.nextLine();
                      int flag = 0 ;
                 for (bai54_danhmuc danhmuc : thongtindanhmuc
                 ) {
                     if(danhmuc.getTenDanhMuc().indexOf(tenDanhMuc) == 0 ) {
                         System.out.println("Cap nhat thong tin san pham cua danh muc: " + tenDanhMuc);
                         danhmuc.capNhapThongTinSanPham();
                         flag = 1;
                     }
                     }
                   if(flag ==0 ) System.out.println("Khong co ten danh muc:"+ tenDanhMuc);
             }else if (luachon == 4){
                 sc.nextLine();
                   int sum = 0  ;
                 for(bai54_danhmuc danhmuc : thongtindanhmuc)
                 {
                     sum+= danhmuc.tongTiencacSanPhamTrongDanhMuc() ;
                 }
                 System.out.println("tong tien cac san pham trong cac danh muc: "+sum);
             }else if (luachon == 5){

                 System.out.println("thong tin san pham xuat xu tu trung quoc:");
                 for(bai54_danhmuc danhmuc : thongtindanhmuc)
                 {
                     danhmuc.lietkeSanPhamTrungQuoc(); ;
                 }
             }
        }while(luachon != 0) ;
    }
}

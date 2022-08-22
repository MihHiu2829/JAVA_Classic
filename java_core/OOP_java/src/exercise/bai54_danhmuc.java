package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class bai54_danhmuc {
    Scanner sc = new Scanner(System.in) ;
    private int maDanhMuc ;
    private String tenDanhMuc ;
    private ArrayList<bai54_SanPham>danhsachSanPham = new ArrayList<bai54_SanPham>();

    public bai54_danhmuc(int maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        bai54_SanPham sp  = new bai54_SanPham() ;
    }
     public void themSanPham(bai54_SanPham sp){
        danhsachSanPham.add(sp) ;
     }
     public int tongTiencacSanPhamTrongDanhMuc(){
        int sum = 0  ;
         for (bai54_SanPham sp :danhsachSanPham
              ) {
             sum+=sp.getGiaCa() ;
         }
         return sum ;
     }
     public void xuatDanhSachSanPham(){
         System.out.println("Danh sach san pham "+ tenDanhMuc );
         for (bai54_SanPham sp : danhsachSanPham
              ) {
             System.out.println(sp.toString());
         }
     }
     public void capNhapThongTinSanPham(){
         System.out.println("Nhap ma san pham ban muon cap nhat: ");
         String maSP = sc.nextLine() ;
         bai54_SanPham sp = new bai54_SanPham(maSP) ;
         for (bai54_SanPham sanPham: danhsachSanPham
              ) {
             if(sanPham.getMaSanPham().indexOf(maSP) == 0) {
                 System.out.println("Co thong tin san phamm, ban muon cap nhap thog tin gi: ");
                 System.out.println("1.Ten san pham: \n"+"2.Gia cua san pham: \n"+"3.Xuat xu san pham\n") ;
                 int luachon = sc.nextInt() ;
                 if( luachon == 1) {
                     System.out.println("nhap ten san pham muon cap nhat: ");
                     String ten =  sc.nextLine() ;
                     sanPham.setTenSanPham(ten);
                 }else if(luachon == 2){
                     System.out.println("nhap gia san pham muon cap nhat: ");
                     int ten =  sc.nextInt() ;
                     sanPham.setGiaCa(ten);
                  }else if(luachon == 3){
                     System.out.println("Nhap xuat su muon cap nhat cua san pham: ");
                     String ten = sc.nextLine() ;
                     sanPham.setXuatXu(ten);
                 }
         }else System.out.println("Khong tim thay ten san pham ban muon cap nhap! ");

         };
     }
     public void lietkeSanPhamTrungQuoc(){
         for (bai54_SanPham sanpham: danhsachSanPham
              ) {
             if(sanpham.getXuatXu().compareToIgnoreCase("TrungQuoc") == 0 ){
                 System.out.println(sanpham);
             }
         }
     }
//     public void inSanPham(bai54_SanPham sp){
//         for (bai54_SanPham sanPham : danhsachSanPham
//              ) {
//             if(sanPham.getMaSanPham().compareTo(sp.getMaSanPham()) == 0) {
//                 System.out.println(sanPham);
//             break;
//             }
//         }
//     }
    public  bai54_SanPham suaSanPham(bai54_SanPham sp){
            return sp ;
    }
    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
}

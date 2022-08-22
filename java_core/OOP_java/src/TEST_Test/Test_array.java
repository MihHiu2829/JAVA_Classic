package TEST_Test;

import Array_List_04.DanhSachSinhVIen;
import Array_List_04.SinhVien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test_array {
    public static void main(String[] args) {
        DanhSachSinhVIen dssv = new DanhSachSinhVIen() ;
        int luachon = 0  ;
        Scanner sc = new Scanner(System.in) ;
        do{
            System.out.println("1.Thêm 1 sinh viên vào danh sach. \n"
            +"2.In danh sách ra màn hình. \n"
            +"3.Xoa danh sach sinh vien. \n"
            +"4.Hien thi so luong sinh vien trong danh sach. \n"
            +"5.Kiem tra danh sach co sinh vien nao khong. \n"
            +"6.Tim sinh vien dua theo ma sinh vien. \n"
            +"7.Xoa sinh vien dua theo ma sinh vien. \n"
            +"8.Tim kiem sinh vien dua theo Ten. \n"
            +"9.Sap sep danh sach sinh vien dua vao diem tang dan. \n"
            +"0.Thoat ra, ket thuc chuong trinh! ");
            System.out.println("Moi chon chức năng để thực hiện.");
            luachon = sc.nextInt() ;
            sc.nextLine() ;
            if(luachon == 1){
                System.out.println("Them 1 sinh vien vao danh sach! ");
                System.out.println("Nhap ho va ten cua sinh vien"); String hoVaTen = sc.nextLine() ;
                System.out.println("Nhap ma so sinh vien "); String MSSV = sc.nextLine()  ;
                System.out.println("Nhap nam sinh cua sinh vien: "); int namSinh = sc.nextInt()  ;
                System.out.println("Nhap diem trung binh cua sinh vien: "); float diem = sc.nextFloat() ;
                SinhVien sv = new SinhVien(namSinh,hoVaTen,MSSV,diem) ;
                dssv.ThemSinhVien(sv);
            }else if(luachon == 2)
            {
                dssv.InSinhVien();
            }else if(luachon == 3)
            {
                dssv.xoaDanhSach();
            }else if(luachon == 4)
            {
                System.out.println("so luong sinh vien trong danh sach: "+dssv.SoLuongSinhVienTrongDanhSach())  ;
            }else if(luachon == 5)
            {
                System.out.println("Tinh trang danh sach sinh vien khong co: "+ dssv.KiemTraDanhSachRong());
            }else if(luachon == 6)
            {
                System.out.println("Nhap ma sinh vien muon tim: "); String maSinhVien = sc.nextLine() ;
                SinhVien sv = new SinhVien(maSinhVien) ;
                System.out.println("sinh vien ton tai:"+dssv.ktraSinhVienTonTai(sv));
            }else if(luachon == 7)
            {
                System.out.println("Nhap ma sinh vien muon tim: "); String maSinhVien = sc.nextLine() ;
                SinhVien sv = new SinhVien(maSinhVien) ;
                System.out.println("Da xoa sinh vien:"+dssv.xoa1svrakhoiDanhSach(sv));
            }else if(luachon == 8){
                System.out.println("Nhap ten muon tim: ");     String ten = sc.nextLine() ;
                dssv.TimKiemduatheoTen(ten);
            }else if(luachon == 9)
            {
                dssv.SapSepdanhsachsinhvientheodiemtuthapdencao();
                dssv.InSinhVien();
            }
        }while(luachon!=0 );
    }
}

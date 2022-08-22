package TEST_Test;


import Arrays_List_03.DanhSachSinhVien;
import Arrays_List_03.SinhVien;

import java.util.Scanner;

public class Testlan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int luachon = 0  ;
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        do{
            System.out.println("\t\tMenu ---------------------------- ");
            System.out.println("Vui lòng chọn chức năng:   ");
            System.out.println("1.      Thêm sinh viên vào danh sách.\n"
                    +"2.        In danh sách sinh viên ra màn hình. \n"
                    +"3.        Kiểm tra danh sách có rỗng hay không. \n"
                    +"4.        Lất ra số  lượng sinh viên trong danh sách. \n"
                    +"5.        Làm rỗng danh sách sinh viên.\n"
                    +"6.        Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mssv. \n"
                    +"7.        Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                    +"8.        Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím. \n"
                    +"9.        Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n"
                    +"0.        Thoát khỏi chương trình");
            luachon = sc.nextInt();
            sc.nextLine() ;
            if (luachon == 1){
                System.out.println("Them 1 sinh vien vao danh sach: ");
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine() ;
                System.out.println("Nhap Ma so sinh vien: "); String masinhvien = sc.nextLine() ;
                System.out.println("Nhap nam sinh "); int namSinh = sc.nextInt() ;
                System.out.println("Nhap diem trung binh : "); float diemtrungbinh = sc.nextFloat() ;
                SinhVien sv = new SinhVien(hoVaTen,masinhvien,namSinh,diemtrungbinh) ;
                dssv.themSinhVien(sv);
            }else if (luachon == 2){
                dssv.InSinhVien();
            }else if (luachon == 3){
                System.out.println("TInh trang danh sach rong: "+ dssv.ktraDanhSachRong());
            }else if (luachon == 4){
                System.out.println("So luong sinh vien trong danh sach: "+ dssv.soluongsinhvien());
            }else if (luachon == 5){
                System.out.println("Da xoa danh sach! ");
                dssv.xoaDanhSach();
            }else if (luachon == 6){
                System.out.println("Nhap Ma so sinh vien: ");String masinhvien = sc.nextLine() ;
                SinhVien sv = new SinhVien(masinhvien) ;
                if(dssv.ktrasinhvientontai(sv)) System.out.println("Sinh vien tren ton tai!");
                else System.out.println("Sinh vien tren khong ton tai");
            }else if (luachon == 7){
                System.out.println("Nhap Ma so sinh vien: "); String masinhvien = sc.nextLine() ;
                SinhVien sv = new SinhVien(masinhvien) ;
                System.out.println("Sinh vien da duoc xoa: "+ dssv.xoa1sinhvienrakhoidanhsach(sv));
            }else if (luachon == 8)
            {
                System.out.println("Nhap ten muon tim: ");
                String ten = sc.nextLine() ;
                dssv.timkiemsinhvienthongquaTen(ten);
            }else if (luachon == 9 )
            {
                dssv.xuatdanhsachcodiemgiamdan();
                dssv.InSinhVien();
            }
        }while(luachon!=0) ;
    }
}

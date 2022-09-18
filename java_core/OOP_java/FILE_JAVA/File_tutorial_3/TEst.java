package File_tutorial_3;

import java.io.File;
import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        QuanLiSinhVien a = new QuanLiSinhVien()  ;
        int luachon = 0    ;
        Scanner sc = new Scanner(System.in) ;
        do{
            System.out.println("Menu: ");
            System.out.println("1.      Thêm sinh viên vào danh sách.\n"
                    +"2.        In danh sách sinh viên ra màn hình. \n"
                    +"3.        Kiểm tra danh sách có rỗng hay không. \n"
                    +"4.        Lất ra số  lượng sinh viên trong danh sách. \n"
                    +"5.        Làm rỗng danh sách sinh viên.\n"
                    +"6.        Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên lop hoc. \n"
                    +"7.        Xóa một sinh viên ra khỏi danh sách dựa trên lop hoc .\n"
                    +"8.        Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím. \n"
                    +"9.        Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n"
                    +"10.       Luu danh sach sinh vien xuong tep tin.     \n"
                    +"11.       Doc du lieu tu file len tep tin. "
                    +"0.        Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng:   ");
            luachon = sc.nextInt();
            sc.nextLine();
            if(luachon == 1) {
                System.out.println("Nhap ten sinh vien: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap dia chi cua "+ hoVaTen);
                String diachi = sc.nextLine() ;
                System.out.println("Nhap lop cua "+ hoVaTen);
                String lop = sc.nextLine()  ;
                System.out.println("Nhap diem trung binh sinh vien: "); float diem = sc.nextFloat();
                sinhvien az = new sinhvien(hoVaTen,diachi,lop,diem) ;
                a.them1sinhvien(az);
            }else if (luachon == 2){
                 a.Indanhsachsinhvien();
            }else if (luachon == 3){
                System.out.println("Danh co dang rong khong: "+ a.ktraDanhSachRong());
            }else if (luachon == 5){
                a.lamRongDanhSach();
                System.out.println("Danh sach da dc lam rong:) ");
            }else if (luachon == 4){
                System.out.println("So luong sinh vien co trong danh sach: "+ a.laySoLuong());
            }else if (luachon == 6){
                System.out.println("Nhap ten lop hoc: ");
                String lophoc = sc.nextLine();
                sinhvien tmp =  new sinhvien(lophoc)  ;
                System.out.println("Sinh vien co ton tai: " + a.kiemtratontaithongqaLopHoc(tmp)) ;
            }else if (luachon == 7) {
                System.out.println("Nhap ten lop hoc! ");
                String lophoc = sc.nextLine();
                sinhvien tmp =  new sinhvien(lophoc)  ;
                System.out.println("Xoa sinh vien thanh cong: "+a.xoa1SV(tmp)) ;
            }else if (luachon == 8){
                System.out.println("Nhap ten hoc sinh: ");
                String ten = sc.nextLine() ;
                a.timKiemSinhVien(ten);
            }else if (luachon == 9){
                a.sapXepgiamtheoDiem();
                a.Indanhsachsinhvien();
            }else if(luachon == 10){
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine() ;
                File f = new File(tenFile) ;
                a.ghiDuLieuXuongFIle(f);
            }else if (luachon == 11){
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine() ;
                File f = new File(tenFile) ;
               a.docDuLieutuFile(f);
            }
        }while(luachon != 0 ) ;
    }
    // D:\code_dev\Java_basic\java_core\OOP_java\src\File_tutorial_3\1D312\abc.txt
}

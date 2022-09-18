package File_tutorial_4;

import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int luachon = 0  ;
        DanhSachSinhVien dssv = new DanhSachSinhVien() ;
        do{
            System.out.println("Menu:");
            System.out.println("1.      Thêm sinh viên vào danh sách.\n"
                    +"2.        In danh sách sinh viên ra màn hình. \n"
                    +"3.        Kiểm tra danh sách có rỗng hay không. \n"
                    +"4.        Lấy ra số  lượng sinh viên trong danh sách. \n"
                    +"5.        Làm rỗng danh sách sinh viên.\n"
                    +"6.        Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên id. \n"
                    +"7.        Xóa một sinh viên ra khỏi danh sách dựa trên ma id .\n"
                    +"8.        Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím. \n"
                    +"9.        Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n"
                    +"10.       Luu danh sach sinh vien xuong tep tin.     \n"
                    +"11.       Doc du lieu tu file len tep tin. "
                    +"0.        Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng:   ");
            luachon = sc.nextInt();
                    sc.nextLine() ;
            if(luachon == 1) {
                System.out.println("Nhap ho ten sinh vien: ");
                String ten = sc.nextLine()   ;
                System.out.println("Nhap ma sinh vien: ");
                String id = sc.nextLine() ;
                System.out.println("Nhap lop cua "+ten);
                String lop = sc.nextLine();
                System.out.println("Nhap diem trung binh cua "+ ten);
                float diem = sc.nextFloat()  ;
                sinhvien sv = new sinhvien(ten,lop,id,diem) ;
                dssv.ThemSV(sv);
            }else if(luachon == 2){
                dssv.InSV();
            }else if(luachon == 3){
                System.out.println("danh sach rong: "+dssv.KtradssvRong());
            }else if(luachon == 4){
                System.out.println("So luong sinh vien trong danh sach: " + dssv.laySoLuong());
            }else if(luachon == 5){
                System.out.println("Lam rong danh sach!");
                dssv.LamRong() ;
            }else if(luachon == 6){
                System.out.println("Nhap ma sinh vien: ");
                String msv = sc.nextLine()  ;
                sinhvien sv = new sinhvien(msv);
                System.out.println("sinh vien ton tai: "+ dssv.ktraTonTai(sv));
            }else if(luachon == 7 ){
                System.out.println("Nhap ma sinh vien: ");
                String msv = sc.nextLine()  ;
                sinhvien sv = new sinhvien(msv);
                System.out.println("Xoa thanh cong: "+ dssv.xoa1Sv(sv));
            }else if(luachon == 8){
                System.out.println("Nhap gium cai ten: ");
                String ten = sc.nextLine() ;
                dssv.timKiem(ten);
            }else if(luachon == 9){
                dssv.sort();
                dssv.InSV();
            }else if(luachon == 10){
                System.out.println("Nhap duong dan cho file: ");
                String duongdan = sc.nextLine() ;
                File f = new File(duongdan) ;
                dssv.GhiDuLieuXuongFile(f) ;
            }else if(luachon == 11){
                System.out.println("Nhap duong dan cho file: ");
                String duongdan = sc.nextLine() ;
                File f = new File(duongdan) ;
                dssv.DocDuLieuRa(f);
            }
        }while(luachon != 0) ;
    }
}

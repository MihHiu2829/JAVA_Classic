package TEST_Test;

import ARRAY_LIST.DanhSachSinhVien;
import ARRAY_LIST.Sinh_Vien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        DanhSachSinhVien dssv = new DanhSachSinhVien() ;
        int luachon = 0  ;
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

            switch (luachon)
            {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    sc.nextInt();
                    String maSinhVien = sc.nextLine() ;
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc.nextLine() ;
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = sc.nextInt() ;
                    System.out.println("Nhập điểm trung bình: ");
                    float diemTrungBinh = sc.nextFloat() ;
                    Sinh_Vien sv = new Sinh_Vien(maSinhVien,hoVaTen,namSinh,diemTrungBinh) ;
                    dssv.themSinhVien(sv);
                    break ;
                case 2:
                    dssv.inDanhSach();
                    break ;
                case 3:
                    System.out.println("Danh sasch sinh vien "+dssv.ktradanhsachRong());
                    break ;
                case 4:
                    System.out.println("So luong sinh vien trong danh sach: "+ dssv.soluongSinhVien());
                    break ;
                case 5:
                    System.out.println("Da xoa tat ca trong danh sach");
                    dssv.LamRongDanhSach();
                    break ;
                case 6:
                    System.out.println("Nhap ma sinh vien: ");
                    String MaSinhVien = sc.nextLine() ;
                    Sinh_Vien svz = new Sinh_Vien((MaSinhVien)) ;
                    System.out.println("kiem tra sinh vien co trong danh sach: "+ dssv.ktraTonTai(svz));
                    break ;
                case 7:
                    System.out.println("Nhap ma sinh vien: ");
                    String MaSinhViena = sc.nextLine() ;
                    Sinh_Vien svza = new Sinh_Vien((MaSinhViena)) ;
                    System.out.println("Xoa sinh vien co trong danh sach: "+ dssv.xoaSinhVien(svza));
                    break;
                case 8:
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTenz = sc.nextLine() ;
                    System.out.println("Ket qua tim kiem: ");
                    dssv.timSinhVien(hoVaTenz);
                    break ;
                case 9:
                    dssv.sapXepSinhViengiamdantheodiem();
                    dssv.inDanhSach();
                    break ;
                default:
            }
        }while(luachon != 0 ) ;
    }
}

package ARRAY_LIST_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        DanhSachSinhVien dssv = new DanhSachSinhVien()   ;
        int luachon = 0   ;
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
            if(luachon == 1){
                sc.nextLine() ;
                System.out.println("Nhap ma sinh vien: "); String maSinhVIen = sc.nextLine() ;
                System.out.println("Nhap ten sinh vien: "); String hoVaTen = sc.nextLine() ;
                System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt() ;
                System.out.println("Nhap diem trung binh: "); float diem = sc.nextFloat() ;
                SinhVien sv = new SinhVien(maSinhVIen,hoVaTen,namSinh,diem) ;
                dssv.themSinhVIen(sv);
            }else if(luachon == 2){
                dssv.inDanhSach();
            }else if(luachon == 3){
                System.out.println("Kiem tra danh sach rong: "+ dssv.ktraDanhSachRong());
            }else if(luachon == 4){
                System.out.println("So luong sinh vien: "+dssv.laysoluongsinhvie());
            }else if(luachon == 5){
                dssv.lamRongDanhSach();
                System.out.println("Da lam rong danh sach! ");
            }else if(luachon == 6){
                System.out.println("Nhap vao 1 ma sinh vien: ");
                sc.nextLine() ;
                  String maSinhVien = sc.nextLine();
                  SinhVien sv = new SinhVien(maSinhVien) ;
                System.out.println("Kiem tra sinh vien co trong danh sach: "+dssv.ktraSinhViencotontai(sv));

            }else if(luachon == 7){
                System.out.println("Nhap vao 1 ma sinh vien: ");
                sc.nextLine() ;
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien) ;
                System.out.println("Xoa sinh vien trong danh sach: "+ dssv.xoaSinhVien(sv)); ;
            }else if(luachon == 8){
                System.out.println("Nhap ten muon tim: ");
                  String ten = sc.nextLine() ;
                System.out.println("Ket qua tim kiem: ");
                dssv.timSinhVien(ten);
            }else if(luachon == 9) {
               dssv.sapXepSinhVienGiamDanTheoDiem();
               dssv.inDanhSach();
            }
        }while(luachon != 0) ;
    }
}

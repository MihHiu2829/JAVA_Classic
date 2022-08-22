package File_tutorial;

import java.util.Scanner;
public class viduvetaptin_1 {
    public static void main(String[] args) {
//        File f1 = new File("C:\\MinGW\\share\\gdb\\python\\gdb") ;
//        System.out.println("Co ton tai: "+ f1.exists());
//
//        File f2 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\Box\\hello") ;
//        f2.mkdir() ;
//        // phuong thuc mkdirs() => tao nhieu thu muc cung luc
//        File f3 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial\\1\\2\\3\\4\\5\\6\\7") ;
//        f3.mkdirs() ;
//        // tao file .dox ,.txt , .
//        File f4 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial\\hello.txt") ;
//        try {
//            f4.createNewFile() ;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //============================================
        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Nhap ten file: ");
        String tenfile = sc.nextLine() ;
        file vdf = new file(tenfile) ;
        int luachon = 0  ;
        do{
            System.out.println("Menu-----------------------------------Menu");
            System.out.println("1. Kiem tra file co the thuc thi: ");
            System.out.println("2. Kiem tra file co the doc: ");
            System.out.println("3. Kiem tra file co the ghi: ");
            System.out.println("4. In duong dan: ");
            System.out.println("5. In ten file: ");
            System.out.println("6. Kiem tra file la thu muc hoac tap tin");
            System.out.println("7. In ra danh sach cac file con: ");
            System.out.println("8. In ra cay thu muc: ");
            System.out.println("0. Thoat ra khoi chuong trinh.");
            luachon = sc.nextInt() ;
            sc.nextLine() ;
            switch(luachon){
                case 1:
                    System.out.println(  vdf.ktraThucThi()) ;
                    break ;
                case 2:
                    System.out.println( vdf.ktraDoc());
                    break ;
                case 3:
                    System.out.println(vdf.ktraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break  ;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSachFilecon();
                    break ;
                case 8:
                    vdf.inCayThuMuc();
                    break ;
            }
            sc.nextLine() ;
        }while(luachon != 0 );
    }
}

package File_tutorial_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_01 {
    public static void main(String[] args) throws IOException {
        File folder = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01") ;
        // ktra thu muc co ton tai hay chua
        System.out.println("Ktra folder co ton tai hay khong: "+ folder.exists());
        // phuong thuc tao file
        File d1 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01_01") ;
        System.out.println("da tao thu muc Test_01_01: "+d1.mkdir()) ;
        // tao ra tep tin cho chuong trinh.
//        File f1 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01_01\\");
        String ten = "D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01_01\\"   ;
//        System.out.println(f1.createNewFile()) ;
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Nhap ten muon dat cho file =]] : ");
        String a =sc.nextLine() ;
        ten = ten + a ;
                File f1 = new File(ten);
        System.out.println(f1.createNewFile()) ;

    }
}

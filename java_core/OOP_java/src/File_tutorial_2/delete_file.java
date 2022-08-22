package File_tutorial_2;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class delete_file {
    public static void xoaFile(File fx){
        if(fx.isFile()){
            System.out.println("Da xoa: "+ fx.getAbsolutePath());
            fx.delete() ;
        }else if(fx.isDirectory()){
            File[] a = fx.listFiles() ;
            for(File az : a){
                  xoaFile(az);
            }
            fx.delete() ;
        }
    }
    public static void main(String[] args) {
        // su dung class file xoa tap tin hoac thu muc
        File f0 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Delete_1\\F0");
        File f1 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Delete_2") ;
        File fn = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Delete_3\\vidu.txt");
        System.out.println(fn.delete());
        xoaFile(f1);

    }
}

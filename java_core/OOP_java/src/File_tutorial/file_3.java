package File_tutorial;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class file_3 {
    public static void xoaFile(File fx){

        if(fx.isFile()) {
            // xoa neu la tap tin
            fx.delete()  ;
        }else if (fx.isDirectory()) {
             File[] mangCon = fx.listFiles() ;
             for(File f: mangCon ){
                 xoaFile(f) ;
             }
             // xoa ban than thu muc sau khi da xoa cac file con ;
            fx.delete() ;
        }
    }
    public static void main(String[] args) {
        File f0 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_1\\") ;
        File f0_1 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_1\\muoi")  ;
        File f = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_1\\hillo.txt");
//        xoaFile(f0_1); // xoa duoc vi la thu muc rong
        // su dung class file xoa tap tin va thu muc ;
//        Path p = FileSystems.getDefault().getPath(null,) ;
        int a =    0 ;
       int t = (++a) + (a++) +(++a)  ;
        System.out.println(t);
    }
}

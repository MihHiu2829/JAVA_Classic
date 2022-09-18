package File_tutorial_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Delete_file_2 {
    public static void xoaFile(File f) {
        if (f.isFile()) {
            f.deleteOnExit();
        } else if (f.isDirectory()) {
            File[] a = f.listFiles();
            for (File az : a) {
                  xoaFile(az);
            }
            f.delete() ;
        }
    }
    public static void main(String[] args) throws IOException {
//      File file = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Delete_2") ;
//      xoaFile(file);
        Path p  = FileSystems.getDefault().getPath(null,"D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Delete_2");
        Files.deleteIfExists(p);
    }
}

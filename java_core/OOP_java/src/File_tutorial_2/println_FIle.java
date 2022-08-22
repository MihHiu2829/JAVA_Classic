package File_tutorial_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class println_FIle {
    public static void main(String[] args) {
        try {

            PrintWriter pw = new PrintWriter("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01\\test01.docx","UTF-8");
            pw.print("Xin chào mọi người");
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

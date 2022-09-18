package File_tutorial_3;

import java.io.*;

public class main {
    public static void main(String[] args) {


        try {
            File file = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_3\\1D312\\abc.txt ") ;
            OutputStream os = null;
            os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os) ;
            sinhvien st = new sinhvien("Doan Minh Hieu","Binh Duong","21DTHC4",10f) ;
            oos.writeObject(st);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

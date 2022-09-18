package File_tutorial_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class vidu_doc_file_2 {
    public static void main(String[] args) {
        File f = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\Test file_01_01\\abc.txt");
//        try {
//            BufferedReader dr = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
//            String line = null ;
//            while(true){
//                 line = dr.readLine() ;
//                if (line == null) break ;
//                else System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            List <String> allText = Files.readAllLines(f.toPath(),StandardCharsets.UTF_8);
            for(String line : allText){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package File_classic;

import java.io.*;

public class Main_01 {
    private static String a ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan01.txt" ;
    private static String c ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan02.txt" ;
    private static String b  ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan.txt" ;
    public static void main(String[] args)  {
        File file = new File(c) ;

        if(file.isFile())
        {
            System.out.println("Complete file: "+ file.getAbsolutePath());
//            file.delete() ;
        }else {
            try {
                file.createNewFile() ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//
//        try {
//            FileInputStream in = new FileInputStream(file) ;
//            byte[] gioByte = new byte[1024] ;
//            int soluongByte = in.read(gioByte) ;
//            while (soluongByte > 0 )
//            {
//                String chuoi = new String(gioByte,0,soluongByte) ;
//                System.out.println(chuoi);
//                soluongByte = in.read(gioByte) ;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String text = "Tui la Minh Hieu" +
                " Nay hoc ghi du lieu vao file." ;
        try {
            FileOutputStream out = new FileOutputStream(file,true ) ;
            byte[] gioByte = text.getBytes() ;
            out.write(gioByte);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

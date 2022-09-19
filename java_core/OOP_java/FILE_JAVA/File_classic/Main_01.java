package File_classic;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main_01 {
    private static String a ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan01.txt" ;
    private static String c ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan02.txt" ;
    private static String b  ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic\\plan.txt" ;
    private static String d  ="D:\\cover_CODE\\code_dev\\Java_basic\\java_core\\OOP_java\\FILE_JAVA\\File_classic" ;
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
//        String text = "Tui la Minh Hieu" +
//                " Nay hoc ghi du lieu vao file." ;
//        try {
//            FileOutputStream out = new FileOutputStream(file,true ) ;
//            byte[] gioByte = text.getBytes() ;
//            out.write(gioByte);
//
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        copy(b,c) ;
        String link = "https://1.bp.blogspot.com/-RNkeSJEbcq4/Xt4paxo7RdI/AAAAAAAAX-k/rwIOoFRQJr82MBPuu5qQqZviRUyJhLS7ACLcBGAsYHQ/s1600/sebastien-gabriel--IMlv9Jlb24-unsplash.jpg";

        downloadFile(link,d);

    }

    private static void downloadFile(String link,  String savePath)
    {

        try{
            URLConnection conn = new URL(link).openConnection();
            InputStream in = conn.getInputStream() ;

              String  fileName = new File(link).getName();
              File f2 = new File(savePath +"\\"+ fileName) ;


              //Lay kich thuoc tap tin:
            int size = conn.getContentLength() ;
            int current =  0 ; 

            new File(savePath).mkdirs() ;
              FileOutputStream out = new FileOutputStream(f2) ;
              byte[] gioByte = new byte[1024] ;
              int slByte = in.read(gioByte) ;
              while(slByte > 0)
              {
                  out.write(gioByte);
                     slByte = in.read(gioByte) ;
                     current+= slByte ;
                  System.out.println("Download...."+(current*100f/size) + "%");
              }
                    in.close();
              out.close();

        }catch (IOException e)
        {

        }
    }
    private static void copy(String a, String b)
    {

        File f1 = new File(a) ;
        File f2 = new File(b) ;

        try {
            FileInputStream in = new FileInputStream(f1) ;
            FileOutputStream out = new FileOutputStream(f2,true) ;

            byte[] gioByte = new byte[1024] ;
            int soluongByte = in.read(gioByte) ;
            while(soluongByte > 0)
            {
//                String chuoi = new String(gioByte,0,soluongByte);
                out.write(gioByte);
                soluongByte = in.read(gioByte) ;
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

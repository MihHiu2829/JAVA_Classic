package File_tutorial_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Java_doi_ten {
    public static void coppyAll(File f1,File f2){
        try {
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
       if(f1.isDirectory()){
           File [] a = f1.listFiles()  ;
            for(File file : a){
                File file_new = new File(f2.getAbsoluteFile()+"\\"+ file.getName()) ;
                coppyAll(file,file_new);
            }
       }
    }
    public  static void xoa(File file){
          if(file.isFile()){
               file.deleteOnExit();
          }else if(file.isDirectory()){
              File [] mangCon = file.listFiles() ;
              for(File a : mangCon){
                  xoa(a)  ;
              }
              file.delete();
//          }LLLL }
    }}
    ////////////awdsawwsawsaws
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\tenfilesaukhidoi");
        File file2 = new File("D:\\code_dev\\Java_basic\\java_core\\OOP_java\\src\\File_tutorial_2\\tenfilesaukhidoi");
//           file.renameTo(file2) ;
//           try{
//               Files.copy(file2.toPath(),file.toPath(), StandardCopyOption.REPLACE_EXISTING) ;
//           }catch (IOException e){
//               e.printStackTrace();
//           }
//        Files.copy(file2.toPath(),file.toPath(),StandardCopyOption.REPLACE_EXISTING);
//           coppyAll(file2,file) ;
//         Files.move(file2.toPath(),file.toPath(),StandardCopyOption.REPLACE_EXISTING);
         xoa(file);
    }
}

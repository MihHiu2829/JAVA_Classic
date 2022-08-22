package File_tutorial;

import java.io.File;
import java.util.Scanner;

public class file_2 {
    File file ;

    public file_2(String file) {
        this.file = new File(file);
    }
    public boolean ktraThucThi(){
        return this.file.canExecute() ;
    }  // cau 1
    public boolean ktraDoc(){
        return this.file.canRead() ;
    } // cau 2
    public boolean ktraGhi(){
        return this.file.canWrite() ;
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTen(){
        System.out.println(this.file.getName());
    }
    public void ktralathumuchaytaptin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc");
        }else if (this.file.isFile()) System.out.println("day la tap tin");
    }
     public void inDanhSachCacfileCon(){
        if(this.file.isDirectory()){
            System.out.println("cac tap tin con/ thu muc con la: ");
           File[] mangCon = this.file.listFiles();
           for(File file : mangCon){
               System.out.println(file.getAbsolutePath());
           }
        }else if(this.file.isFile()){
            System.out.println("Day la tap tin con/");
        }
     }
     public void incaythumuc(){
         inChiTietCayThuMuc(this.file,1);
     }
     public void inChiTietCayThuMuc(File f,int bac){
//         System.out.print("|");
        for(int i=0;i<bac;i++){
            System.out.print("\t") ;
            }
         System.out.print("|__");
            System.out.println(f.getName());
            if(f.canRead() && f.isDirectory()){
                File[] mangCon  = f.listFiles() ;
                for(File fx: mangCon){
                    inChiTietCayThuMuc(fx,bac+1);
                }
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap ten file: ");
        String tenFile = sc.nextLine() ;
        file_2 vdf = new file_2(tenFile) ;
        int luachon = 0 ;
        do{
            System.out.println("Menu");
            System.out.println("1.Ktra file co the thuc thi: ");
            System.out.println("2.Ktra file co the doc: ");
            System.out.println("3.Ktra file co the ghi: ");
            System.out.println("4.In duong dan: ");
            System.out.println("5.In ten file: ");
            System.out.println("6.ktra file la thu muc hay tap tin");
            System.out.println("7.In ra danh sach cac file con. ");
            System.out.println("8.In ra cay thu muc: ");
            System.out.println("0. thoat");
            luachon =sc.nextInt()  ;
            sc.nextLine() ;
             switch(luachon){
                 case 1:
                     System.out.println(vdf.ktraThucThi());
                     break ;
                 case 2:
                     System.out.println(vdf.ktraDoc());
                     break;
                 case 3:
                     System.out.println(vdf.ktraGhi());
                     break ;
                 case 4:
                      vdf.inDuongDan();
                      break;
                 case 5:
                     vdf.inTen();
                     break  ;
                 case 6:
                     vdf.ktralathumuchaytaptin();
                     break;
                 case 7:
                     vdf.inDanhSachCacfileCon();
                     break ;
                 case 8:
                     vdf.incaythumuc();
                     break ;
                 default:
                     break ;
             }
        }while(luachon !=  0) ;
    }
}

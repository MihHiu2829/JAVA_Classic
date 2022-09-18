package File_tutorial_2;

import java.io.File;
import java.util.Scanner;

public class File_02 {
     File file ;

    public File_02(String tenFile) {
        this.file = new File(tenFile) ;
    }
    public boolean ktraThucThi(){
        return this.file.canExecute() ;
    }
    public boolean ktrafileCoTheDoc(){
        return this.file.canRead() ;
    }
    public boolean ktraFileCoThGhi(){
        return this.file.canWrite() ;
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTen(){
        System.out.println("Ten:"+this.file.getName());
    }

    public void ktraFileLaThuMucHayTepTin(){
        if(this.file.isDirectory()) System.out.println("File nay la thu muc.");
        if(this.file.isFile()) System.out.println("File nay la tep tin. ");
        else System.out.println("Khong phai tep tin hay thuc muc. ");
    }
    public void inThuMucCon(){
            File[] mangcon = this.file.listFiles()  ;
             for(File f : mangcon){
                 System.out.println(f.getName());
             }
    }
    public void InCayThuMuc(){
        InChiTiet(this.file,1);
    }
    public void InChiTiet(File f,int bac){
           for(int i=0;i<bac;i++){
               System.out.print("\t");
           }
        System.out.print("__|");
        System.out.println(f.getName());
        if (f.isDirectory() && f.canExecute()){
        File[] mangcon = f.listFiles();
        for(File fn: mangcon){
            InChiTiet(fn,bac+1 );
        }}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap duong dan thu muc: ");
        String duongdan = sc.nextLine() ;
        File_02 dt = new File_02(duongdan);
        int luachon =  0 ;
        do{
            System.out.println("\t\t\t\t____Menu____");
            System.out.println("1.Kiem tra thu muc co the thuc thi.");
            System.out.println("2.Kiem tra thu muc co the doc.");
            System.out.println("3.Kiem tra thu muc co the ghi.");
            System.out.println("4.In duong dan.");
            System.out.println("5.In ten thu muc,ten tep tin.");
            System.out.println("6.Kiem tra xem file la thu muc hay tep tin.") ;
            System.out.println("7.In thu muc con trong file.") ;
            System.out.println("8.In cay thu muc con.");
            System.out.println("0.thoat");
            System.out.println("Nhap chuc nang de thuc hien: ");
            luachon = sc.nextInt() ;
            switch (luachon){
                case 1:
                    System.out.println(dt.ktraThucThi());
                    break ;
                case 2:
                    System.out.println(dt.ktrafileCoTheDoc());
                    break ;
                case 3:
                    System.out.println(dt.ktraFileCoThGhi());
                    break ;
                case 4:
                    dt.inDuongDan();
                    break ;
                case 5:
                    dt.inTen();
                    break ;
                case 6:
                    dt.ktraFileLaThuMucHayTepTin();
                    break ;
                case 7:
                    dt.inThuMucCon();
                    break ;
                case 8:
                    dt.InCayThuMuc();
                    break ;
            }
        }while(luachon != 0 ) ;
    }
}

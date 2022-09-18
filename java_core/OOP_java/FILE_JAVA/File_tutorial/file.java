package File_tutorial;

import java.io.File;

public class file {
    File file  ;

    public file(String file) {
        this.file = new File(file) ;
    }
    public boolean ktraThucThi(){
        // ktra file co the thuc thi
        return this.file.canExecute() ;
    }
    public boolean ktraDoc(){
        // ktra file co the doc
        return this.file.canRead() ;
    }
    public boolean ktraGhi(){
        // ktra file co the ghi ;
        return this.file.canWrite() ;
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTen(){
        System.out.println(this.file.getName());
    }
    public void kiemTraLaThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc. ");
        }else if(this.file.isFile())
            System.out.println("Day la tap tin.");
        else System.out.println("Khong la gi ca :v");
    }
    public void inCayThuMuc(){
        this.inchitietcaythumuc(this.file, 1);
    }
    public void inchitietcaythumuc(File f, int bac){
        for(int i=0; i< bac;i++){
            System.out.print("\t");
            System.out.println(f.getName());
            if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles() ;
            for ( File fx :
                mangCon ) {
                inchitietcaythumuc(fx,bac+1);
            }
            inchitietcaythumuc(f,bac);
        }}
    }
    public void inDanhSachFilecon(){
        if(this.file.isDirectory()){
            System.out.println("cac thu muc con la: ");
            File[] mangcon = this.file.listFiles() ;
            for (File file: mangcon
                 ) {
                System.out.println(file.getAbsolutePath());
            }
        }else System.out.println("Day la tap tin, ko co du lieu con ben trong.");
    }

}

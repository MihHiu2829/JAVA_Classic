package KDL_dacbiet;

public enum Thang {
    Thang_mot(31) ,  // gia tri khong phai thuoc tinh
    Thang_hai(28)  ,
    Thang_ba(30) ,
    Thang_tu(31) ,
    Thang_nam(30) ,
    Thang_sau(31 ) ,
    Thang_bay(31) ,
    Thang_tam(30) ,
    Thang_chin(31)  ,
    Thang_muoi(30) ,
    Thang_muoi_mot(31) ,
    Thang_muoi_hai(30) ;
    private final int soNgay  ;

    Thang(int soNgay) {
        this.soNgay = soNgay ;
    }
    public int soNgay(){
         return soNgay ;
    }
}

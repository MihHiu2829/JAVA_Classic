package OOP_14;

public class Test {
    public static void main(String[] args) {
        toaDo td1 = new toaDo(5,5);
        toaDo td2 = new toaDo(2,8);
        toaDo td3 = new toaDo(13,4);
        Hinh h = new Diem(td1);
        Hinh h2 = new HinhTron(td2,10) ;
        Hinh h3 = new HinhChuNhat(td3,3 ,8) ;
        System.out.println("DT1: "+h.dientich());
        System.out.println("DT2: "+h2.dientich());
        System.out.println("DT3: "+h3.dientich());
    }
}

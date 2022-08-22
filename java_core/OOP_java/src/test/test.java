package test;

public class   test {
    public static void main(String[] args) {
            sinhvien sv1 = new sinhvien(100,"doan Minh Hieu","Lop 1",9.3);
        sinhvien sv2 = new sinhvien(190,"thanh truc","Lop 1",9.1);
        sinhvien sv3 = new sinhvien(130,"Minh Tuan","Lop 1",9.4);
        System.out.println(sv1.compareTo(sv2));
    }
}

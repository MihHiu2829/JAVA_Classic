package OOP_18;

import java.util.Arrays;

public class cat_chuoi_thanh_mang {
    public static void main(String[] args) {
        String s ="Xin chap cac ban, tui la peter!" ;
        String []a = s.split(" ");
        System.out.println(Arrays.toString(a));
        String[]b = s.split(",") ;
        System.out.println(Arrays.toString(b));
        String s2 ="Xin chao, minh la peter,Minh la lap trinh vien";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));
        String s3="Nguyen van A" ;
        String[] d =  s3.split(" ") ;
        System.out.println(Arrays.toString(d));
        System.out.println();
        System.out.println("Ten: "+d[d.length-1]);
    }
}

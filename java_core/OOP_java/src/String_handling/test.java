package String_handling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  ;
        System.out.println("Nhap vao 1 chuoi: ");
        s = sc.nextLine() ;
        System.out.println("----------------------------------------------------------");
        System.out.println(s.length());
        System.out.println("Vi tri thu 3 la: "+ s.charAt(2) );
        byte az[] = s.getBytes() ;
        for (  int i = 0 ;i <  az.length ; i++
             ) {
            System.out.println("lan luot la: "+ az[i]);
        }
    }
}

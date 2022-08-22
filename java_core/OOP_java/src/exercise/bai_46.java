package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap n: ");
        int n = sc.nextInt()  ;
        Random rd = new Random(1000) ;

            int[] a = new int[n] ;
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt() ;
        }
        Arrays.sort(a);
        System.out.println("Gia tri nho nhat la:" +a[0]);
    }
}

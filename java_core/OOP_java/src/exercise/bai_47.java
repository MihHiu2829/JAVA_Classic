package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai_47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        int n ;
        System.out.println("Nhap so luong cho n: ");
        n = sc.nextInt() ;
        int a[] = new int[n] ;
        for(int i=0;i<n;i++){
            RandomArray(a,i);
        }
        Arrays.sort(a);
        System.out.println("Gia tri nho nhat: "+ a[0]);
    }
    public static void RandomArray(int a[],int local){
        Random sd = new Random() ;
        a[local] = sd.nextInt(1,100) ;
    }
}

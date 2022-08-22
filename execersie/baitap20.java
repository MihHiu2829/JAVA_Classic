package execersie;

import java.util.Arrays;
import java.util.Scanner;

public class baitap20 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] aStrings){
         int n,a,l; 
         int[] array  ; 
          System.out.println("Nhap so luong phan tu cua mang: ");
          n  =  in.nextInt(); 
          array = nhap(n); 
          System.out.println("Nhap phan tu muon chen: ");
          a =in.nextInt();  
          System.out.println("Vi tri muon chen: ");
          l = in.nextInt();  
          for(int i=n;i>l;i--){
                 array[i] = array[i-1]; 
          }
          array[l] =  a ; 
            System.out.println(Arrays.toString(array)); 
    }
    public static int[] nhap(int n){
        int[] x = new int[n+1]; 
        int i = 0  ;  
          while(n>i){
                 x[i++] = in.nextInt();  
          }
          return x ; 
    }
}

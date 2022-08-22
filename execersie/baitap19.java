package execersie;

import java.util.Arrays;
import java.util.Scanner;

public class baitap19 {
       public static Scanner in = new Scanner(System.in); 
       public static void main(String[] aStrings){
           int[] a,b,c ; 
           int m,n,k ;  
            System.out.println("Nhap phan tu cua mang a: ");
            m = in.nextInt(); 
            System.out.println("Nhap phan tu cua mang b: ");
            n = in.nextInt(); 
            a = nhap(m); 
            b = nhap(n); 
            k = m+n  ;  
            System.out.println("Nhap p de ngat quang cua a va b: "); 
            int p  = in.nextInt() ;
            c = new int[k] ; 
            for(int i=0;i<p;i++){
                    c[i] = a[i]; 
            }
            for(int i=0;i<n;i++){
                c[i+p] = b[i]; 
            }
            for(int i=p;i<m;i++){
                c[n+i] = a[i]; 
            }
            System.out.println(Arrays.toString(c));
       }
       public static int[] nhap(int n){
           int[] x = new int[n]; 
           for(int i=0;i<n;i++){
                x[i] = in.nextInt() ;  
           }
           return x ; 
       }
}

package execersie;

import java.util.Scanner;

public class baitap17 {
    public static void main(String[] aStrings){
           int n  ;
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter quanity of array: ");
           n = in.nextInt(); 
           int[] a = new int[n] ;  
           for(int i=0;i<n;i++){
                 System.out.print("Enter element "+(i+1)+" of array: ");
                 a[i] = in.nextInt(); 
           }
           System.out.println("Enter number u want find prime: ");
           int number = in.nextInt(); 
           in.close(); 
           int min = 100 ,tmp2=0;  
           for(int i=0;i<n;i++){
               if(prime(a[i])==1){
                   int tmp = Math.abs(number - a[i]) ; 
                   if (min > tmp) {
                                 min = tmp ; 
                                   tmp2  = a[i]; 
                   } 
               }
           }
           System.out.printf("So nguyen to gan voi so ban nhap nhat la: %d\n", tmp2); 
                  
    }
    public static int prime(int n){
             if(n<2) return  0 ;  
             for(int i=2;i<=Math.sqrt(n);i++){
                  if(n%i==0) return 0  ; 
             }
             return 1 ; 
    }
}

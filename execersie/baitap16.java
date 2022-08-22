package execersie;

import java.util.Scanner;

public class baitap16 {
    public static void main(String[] aStrings){
            int n  ;  
            System.out.println("Enter quanity of  array: ");
            Scanner in = new Scanner(System.in); 
               n = in.nextInt(); 
               int[] a = new int[n]; 
               int[] res = new int [n]; 
            for(int i=0;i<n;i++){
                System.out.println("Enter element "+(i+1)+" of array: ");
                a[i] = in.nextInt() ;  
                res[i] = -1 ;  
            }
            in.close(); 
            int max = 0  ; 
            int count ; 
            for(int i=0;i<n-1;i++){
                   count = 0  ; 
                for(int j=i+1;j<n;j++){
                         if(a[i] == a[j] && res[j] == -1){
                                count++  ; 
                                res[j] = 0  ; 
                         }
                }
                if( max < count ) max = count ;   
            }
           for(int i=0;i<n-1;i++){
                 count =  0 ; 
                for(int j=i+1;j<n;j++){
                    if(a[i] == a[j]) count++  ; 
                }
                if(count == max ) {System.out.println("phần tử có số lần xuất hiện nhiều nhất là: "+a[i]+" với số lần xuất hiện: "+max); 
                break ; 
            } 
           }
    }
}

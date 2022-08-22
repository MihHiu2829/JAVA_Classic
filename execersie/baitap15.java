package execersie;

import java.util.Scanner;


public class baitap15 {
    private static Scanner in = new Scanner(System.in) ; 
    public static  void main(String[] aStrings){
           int n,i ;
           System.out.println("Enter quanity of array: ");
           n = in.nextInt(); 
           int[] a = new int[n]; 
            for(i=0;i<n;i++){
                System.out.println("Enter element, index number "+(i+1)) ;
                a[i] = in.nextInt() ;   
            }   
            
            int z = n/2,flag = 1  ;  
            for(int j=0;j<=z;j++){
                    int x = n-j-1 ;  
                      if(a[j] != a[x]) {
                          flag = 0 ; 
                          break ;  
                      }
            }
            if(flag == 1) System.out.println("symmetry array!");
            else System.out.println("Not Symmetry array!") ; 
             
    } 


} 


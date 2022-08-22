package execersie ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
public class baitap18{
    public static void main(String[] aStrings){
          int n  ; 
          Scanner in = new Scanner(System.in);
            n =  in.nextInt();  
            int count=0 ;  
            Random az =  new Random();  
                  int[] a, b ;  
                  a = new int[n];
                  b = new int[n]; 
            while(n>count){
                a[count++] = az.nextInt(20);
            }
            in.close(); 
            int sizeb= 0 ; 
            boolean IsEsixt = true ;  
            for(int i=0;i<n;i++){
                IsEsixt = true;  
                for(int j=0;j<n;j++){
                      if(a[i] == b[j]){
                              IsEsixt = false ; 
                              break  ;
                      }
                }
                if(IsEsixt) b[sizeb++] = a[i]; 
             }
                System.out.println(Arrays.toString(a));
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
    }
}
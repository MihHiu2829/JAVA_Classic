package execersie;

import java.util.Scanner;

public class baitap12 {
    public static void main(String[] aStrings){
           System.out.println("Enter number: ");
           Scanner in = new Scanner(System.in); 
           int number  = in.nextInt();
           in.close(); 
           long f0=0,f1=1,fn = 0 ; 
               for(int i=1;i<=number;i++){
                   if(i<2){
                       System.out.println(i);  
                   }
                   else{
                       fn = f0 +f1 ; 
                       f0 = f1 ;
                       f1 = fn ; 
                       System.out.println(fn); 
                   }
               }
              
    }
}

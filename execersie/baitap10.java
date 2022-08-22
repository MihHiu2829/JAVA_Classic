package execersie;

import java.util.Scanner;

public class baitap10 {
    public static void main(String[] aStrings){
          System.out.println("Enter number: ");
          Scanner in = new Scanner(System.in);  
          int number = in.nextInt()   ;
          in.close();  
          int i = 2 ; 
         while(number!=1){
                if (number%i==0){
                      System.out.print(i+" ");
                      number/=i ;  
                }
                else i++ ; 
         }
    }
}

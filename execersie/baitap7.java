package execersie;

import java.util.Scanner;

public class baitap7 {
    public static void main(String[] aStrings){
             int number ; 
             Scanner in =  new Scanner(System.in); 
             System.out.println("Enter number: "); 
              number = in.nextInt();  
              in.close();
            double sum =  0  ; 
            for(int i=1;i<=number;i++){
                  sum+= (double)1/i ;  
            }
              System.out.println(sum);
    }
}

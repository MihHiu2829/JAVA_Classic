package execersie;

import java.util.Scanner;

public class baitap9 {
    public static void main(String[] aStrings){
          System.out.printf("Enter number: \n");
          int number,sum=0 ; 
          Scanner in = new Scanner(System.in);  
          number = in.nextInt(); 
          in.close(); 
          while(number!=0){
                  sum+= number%10 ; 
                  number/=10 ; 
          }
          System.out.println("Sum of number: "+sum); 
    }
}

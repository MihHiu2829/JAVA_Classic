package execersie;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] aStrings){
            int number, i,Sum=0  ;  
            Scanner in = new Scanner(System.in); 
            System.out.println("ENter number to caculator sum: ");
            number = in.nextInt() ; 
            in.close();  
            if(number%2 == 0 ) i  = 2 ; 
            else i = 1 ; 
            for(;i<=number;i+=2) {Sum+=i ;} 
               System.out.printf("\nSum of number: %d\n",Sum);   

    }
}

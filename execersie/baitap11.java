package execersie;

import java.util.Scanner;


public class baitap11 {
    public static void main(String[] aStrings){
        Scanner in = new Scanner(System.in) ; 
           int number = in.nextInt();
           in.close(); 
          for(int i=2;i<=number;i++){
              if(Prime(i)) System.out.print(i+"  "); 
          }
    }
    public static boolean Prime(int n){
        for(int i=2;i<= Math.sqrt(n);i++){
                if(n%i == 0) return false ; 
        }
        return true ;  
    }
}

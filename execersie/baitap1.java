

import java.util.Scanner;

public class baitap1{ 
     public static void main(String[] aStrings){

     
      int m, n ;  
      Scanner a = new Scanner(System.in) ; 
      m = a.nextInt() ; 
      n = a.nextInt(); 
      for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
                System.out.print(" * ");
          }
        System.out.println(); 
      }
      a.close(); 
}
  }
package execersie;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] aStrings){
          int n,x,output ;  
          Scanner a = new Scanner(System.in); 
          n = a.nextInt(); 
          for(int i = 1;i<=n;i++){
                 for(int j=0;j<=n*2;j++){
                          x = j - n ;  
                          if(x<0){
                              x*=-1 ; 
                          }
                          output =  i-x ; 
                          if(output>0){
                              System.out.printf("%3d",output); 
                          }
                          else{
                              System.out.printf("   ");
                          }
                 }
                 System.out.println(); 
          }
          a.close(); 
    }
}

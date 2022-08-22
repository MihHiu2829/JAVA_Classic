package execersie;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args){
        int m, n  ; 
         Scanner in =  new Scanner(System.in); 
         System.out.println("Enter crow: ");
         m = in.nextInt(); 
         System.out.println("Enter column: ");
         n = in.nextInt(); 
         for(int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                    if(i==1 || i==m || j==n || j==1) {
                        System.out.print(" * ");
                    }
                       else  System.out.print("   ");         
             }
             System.out.println(); 
         }
         in.close(); 
    }
}

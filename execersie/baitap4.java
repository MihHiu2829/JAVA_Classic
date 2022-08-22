package execersie;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] aStrings){
        
            Scanner in = new Scanner(System.in); 
            System.out.println("Nhap ban cuu chuong: ");
            for(int i=1;i<=10;i++){ 
                 for(int j=1;j<=10;j++){
                 System.out.printf("%d x %d = %d",j,i,j*i);
                 System.out.println() ;
                 }
                 System.out.printf("------------------------------\n");
            }
            in.close(); 
    }
}

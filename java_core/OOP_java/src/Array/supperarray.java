package Array;

import java.util.Scanner;

public class supperarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n  ;
        n = in.nextInt() ;
        int prime = n*2 ;
        for(int i=1;i<=n;i++){
              int za = 1 ;
            for(int j=1;j<=n;j++){
                if(j*i <= n*2) {
                    System.out.printf("%-5d",i*j);
                }
                else if (i == n ) System.out.printf("%-5d",(++za*2));
                    else System.out.printf("%-5d",(2*za++));
            }
            System.out.println(" ");
        }
    }
}

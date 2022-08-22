package execersie;

import java.util.Scanner;

public class baitap8 {
    public static void main(String[] aStrings) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int  n = in.nextInt();
        in.close(); 
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                count++;
                System.out.print(i+" "); }
        }
        System.out.printf("NUmber have %d uwosc :)) ",count); 
    }
}

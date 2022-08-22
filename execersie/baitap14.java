package execersie;

import java.util.Scanner;

public class baitap14 {
    public static void main(String[] aStrings){
            int n , m   ;
            Scanner in = new Scanner(System.in) ; 
             System.out.println("ENter m and n: ");
             m = in.nextInt() ; 
            n = in.nextInt() ; 
            for(int i=m;i<=n;i++){
                if(check(i))System.out.print(i+"  "); 
            }
            in.close(); 
    }
    public static boolean check(int n){
            double tmp = Math.sqrt(n); 
            int z = (int)tmp ; 
            if(tmp-z ==0 ) return true  ;
            return false ; 
        
    }
}

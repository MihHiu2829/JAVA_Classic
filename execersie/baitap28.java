import java.util.Scanner;

public class baitap28 {
     static int n ;  
         static int[] a  = new int[20]; 
    public static void show(){
           for(int i=0;i<n;i++){
               System.out.print(a[i]);
           }
           System.out.print("  ");
    }
       static void Try(int x){
             for(int i=0;i<=1;i++){
                   a[x]  = i ;  
                   if(x == n-1) show() ; 
                   else Try(x+1); 
             }
    }
    public static void main(String[] aStrings) {
        Scanner in = new Scanner(System.in) ; 
        System.out.println("Nhap vao do dai n cua day binary: ");
       n = in.nextInt() ;  
     System.out.println();
     Try(0); 
}
}

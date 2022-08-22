package execersie ;

import java.util.Scanner;

public class baitap25{
    public static Scanner in = new Scanner(System.in)  ; 
    public static void main(String[] aStrings){
        String a ; 
        System.out.println("Nhap ten cua ban: ");
        a = in.nextLine();
        String[] arr = a.split(" ");
        String tmp =  arr[0] ;
        String tmp1 = arr[arr.length-1]; 
        for(int i=(arr.length-2);i>0;i--){
                arr[i+1] = arr[i]; 
        } 
        arr[0]  =  tmp1 ; 
        arr[1] = tmp ; 
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}
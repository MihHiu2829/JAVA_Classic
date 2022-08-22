package execersie  ;

import java.util.Scanner;

public class baitap24{
    public static Scanner in = new Scanner(System.in); 
        public static void main(String[] aStrings){
              String a ; 
              System.out.println("Nhap chuoi: ");
              a = in.nextLine() ; 
              String[] arr  = a.split(" "); 
              int index = 0,local_max = 0 , max = 0  ; 
              for(int i=0;i<arr.length;i++){
                  if(arr[i].length() > max){
                      max = arr[i].length();
                      local_max =  index ;  
                  }
                  index++ ;  
              }
              System.out.println("CHu dai nhat co do dai: "+max+" o vi tri "+(local_max+1)+" "); 
        }
}
package execersie;

public class baitap13 {
          public static void main(String[] aStrings){
                        for(int i=100000;i<=999999;i++){
                               int tmp =  0 , count = 0 ;  
                               int n = i ;  
                               while(n!=0){
                                   tmp = tmp*10+n ;  
                                   n/=10;  
                               
                               if(tmp==i) {
                                   System.out.printf("%10",i);
                                    count++;
                                    if(count%10 == 0) 
                                    System.out.println();   
                                  } 
                                 }
                                       
           }
}
} 

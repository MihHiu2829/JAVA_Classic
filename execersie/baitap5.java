
package execersie ; 
import java.util.Random;
import java.util.Scanner;

public class baitap5{
    public static void main(String[] aStrings){
        Random random = new Random();  
        Scanner in = new Scanner(System.in) ;
        System.out.printf("Enter number: "); 
        int n  = in.nextInt(); 
        int count = 0 ; 
        while(true){
                int a = random.nextInt(100);  
                count++ ; 
                if(a==n) {
                          System.out.printf("was find number = random! \n");
                          System.out.printf("total %d random was find number similar random number!\n",count); 
                          break  ;
                }else 
                    System.out.printf("Number random: %d and Input u enter: %d\n",a,n); 
        }
        in.close(); 
    }
}

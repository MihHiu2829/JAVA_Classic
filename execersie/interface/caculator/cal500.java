import java.util.Scanner;


public class cal500 {
    static Scanner in  = new Scanner(System.in); 
    public static void  main(String[] aStrings){
          int x,y ;  
          System.out.println("Nhap toa do cho robot: ");
           x = in.nextInt() ; 
           y = in.nextInt() ; 
           System.out.println("Nhap cu chi cho robot: ");
           String a  ;  
               a = in.next() ; 
               int i = 0  ; 
            for(i=0;i<a.length();i++){
                   
                    switch(a.charAt(i)) 
                    {    
                        case 'D':
                             System.out.printf("%d %d \n",x+1,y);
                             break ; 
                        case 'N':
                             System.out.printf("%d %d \n",x,y-1);
                              break ;
                        case 'B':
                        System.out.printf("%d %d \n",x,y+1);
                                break ; 
                        case 'T':
                             System.out.printf("%d %d \n",x-1,y);
                              break; 
                        default :
                            System.out.printf("Robot k nhan duoc tin hieu >: %d %d \n",x,y);
                         break  ;
                    }
            }
    }
}

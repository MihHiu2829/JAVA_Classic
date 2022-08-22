import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Casio{ 
     public static void main(String[] aStrings) throws IOException{
         FileWriter out = new FileWriter("passwordValiation.txt"); 
         File file = new File("password.txt"); 
         Scanner in = new Scanner(file) ; 
         String tmp = "file"  ;
         String tmp1 = " : YES"; 
         String tmp2 =" : NO"; 
         while(in.hasNextLine()){
             tmp  = in.nextLine(); 
                if(check(tmp)) {
                    tmp+=tmp1 ; 
                    out.write(tmp+"\n\r") ; 
                }else{
                     tmp+=tmp2;  
                     out.write(tmp+"\n\r");
                }
         }
         out.close();
         in.close() ; 
     }
     public static boolean check(String a){
         int i = 0 ,  case_1 = 0  ,case_2 = 0 , case_3 = 0, dem = 0  ;
            for(i=0;i<a.length();i++){
                if(a.charAt(i) >= 48 || a.charAt(i) <= 57 ) case_1 ++ ; 
                if(a.charAt(i) >= 65 || a.charAt(i) <= 90 ) case_2 ++ ; 
                if(a.charAt(i) >= 97 || a.charAt(i) <= 122 ) case_3 ++ ; 
                dem++ ; 
            } 
             if(dem >=  8 && case_1 > 0 && case_2 > 0 && case_3 > 0)
                 return true ; 
                return false ; 
     }
     
}
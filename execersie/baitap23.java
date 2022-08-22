package execersie;

public class baitap23 {
    public static void main(String[] aStrings){ 
        int count = 0 ;  
          for(int i=100000000;i<999999999;i++){
              if(thuannghic(i+"")){
                  System.out.printf("%12d",i); 
                  count++ ; 
                  if(count%10 == 0) System.out.println();
              }
          }
    }
    public static boolean thuannghic(String s){
        String other ; 
        StringBuilder builer = new StringBuilder(s); 
        other = builer.reverse().toString();
        return (s.compareTo(other) == 0);
    }
}

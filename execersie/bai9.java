public class bai9{
    public static void main(String[] args){
          int[] a; 
          a = new int[3]; 
          int[][] b = new int[4][5] ; 
          a[0]  = 1 ; 
          a[1]  = 2 ; 
          a[2]  = 3 ; 
          System.out.println(a);
          System.out.println(b);
          System.out.println(b.length) ;
    
          for(int i=0;i<a.length;i++){
              System.out.write(a[i]);
          }
    }
}
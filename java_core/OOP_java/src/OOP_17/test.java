package OOP_17;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = new int[] {1,8,2,6,4,3,7,9} ;
        int[] b = new int[15] ;
        // ham sort
        System.out.println("a ban dau:  "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("a sau sap sep :  "+Arrays.toString(a));

        // ham tim kiem
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,-1));
         // ham dien gia tri:
        Arrays.fill(b,5) ;
        System.out.println("b sau khi dien gia tri: "+ Arrays.toString(b));
        a = test.reverse(a) ;
        System.out.println("a sau khi dao chieu"+ Arrays.toString(a));
    }
    public static int[] reverse (int[] x){
        int [] rs = new int[x.length] ;
        int index = 0  ;
        for(int i = x.length-1; i>=0;i--)
        {
            rs[index] = x[i] ;
            index++ ;
        }
        return rs ;
    }
}

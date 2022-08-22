package Array;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] mang1 = {1,2,3,4,5,6,7,8,9,10,11,12,12,14}  ;
        int[] mang2 = new int[mang1.length] ;
        System.arraycopy(mang1,0,mang2,0,2) ;
        System.out.println(Arrays.toString(mang2));
    }
}

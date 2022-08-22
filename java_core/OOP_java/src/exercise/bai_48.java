package exercise;

import java.util.*;

public class bai_48 {
    public static void main(String[] args) {
        ArrayList<Integer>ds = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap so luong n: ");
        int n = sc.nextInt()  ;
        Random rd = new Random() ;
        for(int i=0;i<n;i++){
            ds.add(rd.nextInt(1,10)) ;
        }
        Integer a[] = new Integer[ds.size()] ;
            ds.toArray(a) ;
        Arrays.sort(a);
        System.out.println("Gia tri nho nhat la:"+ a[0]);
    }
}

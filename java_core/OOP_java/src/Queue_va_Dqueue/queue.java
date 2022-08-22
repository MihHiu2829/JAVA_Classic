package Queue_va_Dqueue;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String>dequeTen = new ArrayDeque<String>();
        dequeTen.offerFirst("Doan Minh Hieu") ;
        dequeTen.offerLast("Nguyen Thanh Lam") ;
        dequeTen.offerFirst("Nguyen Vu Quan");
        dequeTen.offerLast("Nguyen Ngoc Quyen");
        System.out.println(dequeTen.toString());
     }
}

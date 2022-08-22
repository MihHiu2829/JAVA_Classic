package Array;

import java.util.Arrays;

public class Vidu {
    public static void main(String[] args) {
        String a = "Doan Minh Hieu"  ;
        String []s = a.split(" " );
        System.out.println(Arrays.toString(s));
        String az = "Còn 1 project âm nhạc của tuần này chưa hoàn thành, mà hôm nay thứ 4 con mẹ ló rùi. Bạn ơi hoàn thành ló đi:)" ;
        String []ss = az.split("\\.|\\,|\\ chưa") ;
        System.out.println(Arrays.toString(ss));
    }
}

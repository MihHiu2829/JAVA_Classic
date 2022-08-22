package OOP_13;

public class Test {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.timMin(4,5));
        System.out.println(mm.timMin(5.23132424,3.31243));
        double a[] ={1.3,2.12,3.245,4.000234,5.2340123,6.5213773,7.24124,8.53,9.21,10.9} ;
        System.out.println(mm.sum(a));
    }
}

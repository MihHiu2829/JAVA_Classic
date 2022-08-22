package Box;

public class textbox{
    public static void main(String[] args) {
        main box = new main(15);
        System.out.println("Gia tri: "+ box.getValue());
//        main box = new main(15.5) ;
//        main box3 = new main("Xin chao");
        box2 b1 = new box2<Integer>(15);
        System.out.println("Gia tri: "+ b1.getValue());
        box2 b2 = new box2("XIn chao") ;
        box2 b3 = new box2<Double>(15.6);
        System.out.println("Gia tri: "+ b2.getValue());
        System.out.println("Gia tri: "+ b3.getValue());
    }
}

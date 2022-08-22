package OOP_4;


public class main {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(12,5,2025);
        MyDate MD2 = new MyDate(12,5,2025);
        MyDate md3 = new MyDate(12,5,2025);

//        System.out.println(md1 );
//        System.out.println(MD2 );
//        System.out.println(md3 );

//        if (md1 == md2 ){
//            System.out.println("==");
//        }else System.out.println("!=");
//    }
        System.out.println("md1 so sanh voi md2: "+ md1.equals(MD2));
        System.out.println("md1 so sanh voi md3: "+ md1.equals(md3));

}}

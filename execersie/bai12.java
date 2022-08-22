public class bai12{
    public static void main(String[] aStrings){
        person a = new person();
        a.age  = 18  ;
        a.point = 9.3f   ;
        a.name = "Doan Minh Hieu";
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.point);
        a.eat(); 
    }
}
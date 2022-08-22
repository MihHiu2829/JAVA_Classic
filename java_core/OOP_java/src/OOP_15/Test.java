package OOP_15;

public class Test {
    public static void main(String[] args) {
        edittion h1 = new edittion("Hang 1","Viet Nam");
        edittion h2 = new edittion("Hang 2","USA") ;
        edittion h3 = new edittion("Hang 3","Nhat ban");
        planes ve1 = new planes(h1,"xang") ;
        oto ve2 = new oto(h2,"xang") ;
        bike ve3 = new bike(h3) ;
        System.out.println("Lay hang san xuat: ");
        System.out.println("p1: "+ ve1.getNameedititon());
        System.out.println("begin: ");
        ve2.begin();
        System.out.println("Lay van toc: ");
        System.out.println("ve1: "+ve1.getspeed());
        System.out.println("ve2: "+ve2.getspeed());
        System.out.println("ve3: "+ve3.getspeed());
        System.out.println("Cat canh: ");
        ve1.lift();
    }
}

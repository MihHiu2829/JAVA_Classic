package OOP_6;

public class test {
    public static void main(String[] args) {
        Date date_1 = new Date(12,5,2003) ;
        Date date_2 = new Date(21,11,2003);
        Date date_3 = new Date(26,5,2003) ;
        edition edn1 =  new edition("Vinh Phu","Viet Nam");
        edition edn2 = new edition("Chau Van Liem", "Viet Nam");
        edition edn3 = new edition("Nguyen Trai","Viet Nam");
        film film1 = new film("Phim 1",edn1 ,2012 ,24000,date_1) ;
        film film2 = new film("Phim 2",edn2 ,2013 ,25000,date_2) ;
        film film3 = new film("Phim 3",edn3 ,2014 ,22000,date_3) ;
        System.out.println();
    }
}

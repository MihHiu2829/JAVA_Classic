package OOP_2;

public class main {
    public static void main(String[] args) {
        MyDate md = new MyDate(31,12,2021) ;
        md.setDay(12);
        System.out.println("Day: "+md.getDay());
        md.setMonth(23);
        System.out.println("Month: "+md.getMonth());
        md.setYear(-23);
        System.out.println("Year: "+md.getYear());
    }
}

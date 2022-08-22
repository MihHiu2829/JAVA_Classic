package OOP_5;

public class test {
    public static void main(String[] args) {
        Date ngay1 = new Date(12,5,2003) ;
        Date ngay2 = new Date (21,12,2003);
        Date ngay3 = new Date (12,4,2003) ;
        writer writer1 = new writer("Minh Hieu",ngay1)  ;
        writer writer2 = new writer("Ngoc Quyen",ngay2) ;
        writer writer3 = new writer("Man Tam",ngay3) ;
        book book1 = new book("Lap trinh C",5000,2021,writer1);
        book book2 = new book("Lap trinh java",28000,2018,writer2);

        book book3 = new book("Lap trinh css",14000,2018,writer3) ;
           book1.printBook();
           book2.printBook();
           book3.printBook();
        System.out.println("So sanh NXB sach 1 va sach 3: "+book1.checkYear(book3));
        System.out.println("So sanh NXB sach 2 va sach 3: "+book2.checkYear(book3));
        System.out.println("Sach 1 giam 10%: "+book1.priceReduce(10));
        System.out.println("Sach 2 giam 20%: "+book2.priceReduce(20));
        System.out.println("Sach 3 giam 50%: "+book3.priceReduce(50));

    }

}

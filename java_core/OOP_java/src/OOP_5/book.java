package OOP_5;

public class book {
    private String nameBook ;
    private double price ;
    private int year_edition ;
    private writer tacgia  ;

    public book(String nameBook, double price, int year_edition, writer tacgia) {
        this.nameBook = nameBook;
        this.price = price;
        this.year_edition = year_edition;
        this.tacgia = tacgia;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear_edition() {
        return year_edition;
    }

    public void setYear_edition(int year_edition) {
        this.year_edition = year_edition;
    }

    public writer getTacgia() {
        return tacgia;
    }

    public void setTacgia(writer tacgia) {
        this.tacgia = tacgia;
    }
    public void printBook(){
        System.out.println(nameBook);
    }
    public boolean checkYear(book anotherBook){
          return year_edition == anotherBook.getYear_edition();
    }
    public double priceReduce(double reduce){
        return this.price*(1-reduce/100) ;
    }
}

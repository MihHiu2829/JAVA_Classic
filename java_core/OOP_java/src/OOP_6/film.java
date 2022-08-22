package OOP_6;

public class film {
    private String nameFilm ;
    private edition edn ;
    private int yearEdition;
    private  int price;
    private Date date;

    public film(String nameFilm, edition edn, int yearEdition, int price, Date date) {
        this.nameFilm = nameFilm;
        this.edn = edn;
        this.yearEdition = yearEdition;
        this.price = price;
        this.date = date;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public edition getEdn() {
        return edn;
    }

    public void setEdn(edition edn) {
        this.edn = edn;
    }

    public int getYearEdition() {
        return yearEdition;
    }

    public void setYearEdition(int yearEdition) {
        this.yearEdition = yearEdition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public boolean check_movie_ticket(film another){
          return price == another.getPrice() ;
    }
    public String Name_film(film another){
        return another.getNameFilm();
    }
    public int Price_promotion(int promotion)
    {
          return price*(1-promotion/100) ;
    }
}

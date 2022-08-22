package OOP_3;

import java.util.Objects;

public class MyDate {
    private int day  ;
    private int month ;
    private int year  ;
    public MyDate(){
        day = 0  ;
        month = 0  ;
        year = 0  ;
    };
    public MyDate(int day, int month, int year) {
        if (day >= 1 || day <= 31) {
            this.day = day;
        }else this.day = 1 ;
        if (month >=1 || month <=12) {
            this.month = month;
        }else this.month = 1 ;
        if (year >=0) {
            this.year = year;
        }else this.year = 1  ;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(day >= 1 && day<=12)
            this.day = day;
        else this.day = 1  ;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >=1 && month<=12)
            this.month = month;
        else this.month = 1;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0 )
            this.year = year;
        else this.year =  1 ;
    }



    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || this.getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day && month == myDate.month && year == myDate.year;
//    }
   public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null ) return false ;
        if (this.getClass() != obj.getClass() )
            return false ;
        MyDate other = (MyDate) obj  ;
        if (day != other.day) return false ;
        if (month != other.month) return false ;
        if (year == other.year) return false   ;
        return true ;
   }
    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}


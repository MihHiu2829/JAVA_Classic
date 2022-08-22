package OOP_1;

public class mydate {
       private int day ;
       private int month ;
       private int year ;
     public mydate(int d, int m,int y){
            this.day = d  ;
            this.month = m  ;
            this.year = y ;
     }
     public void printDay(){
            System.out.println("Day: "+day);
     }
     public void printmonth(){
              System.out.println("month: "+month);
       }
       public void printyear(){
              System.out.println("year: "+year);
       }
       public void printDate(){
              System.out.println("Date: "+day+"-"+month+"-"+year);
       }
}

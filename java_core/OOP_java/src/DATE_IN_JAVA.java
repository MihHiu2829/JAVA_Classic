import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DATE_IN_JAVA {
    public static void main(String[] args) {
//        long t1 = System.currentTimeMillis()  ;
//        int sum = 0  ;
//        for(int i=0;i<100;i++){
//            System.out.println("Xin chao cac ban");
//        }
//        long t2 = System.currentTimeMillis() ;
//        System.out.println("thoi giann luc dau: "+ t1 );
//        System.out.println("Thoi gian luc sau: "+ t2);
//        System.out.println("Thoi gian chay vong for: "+ ((t2-t1)) + " mls");
        // timeUnit ;
        System.out.println("3000 nam = "+ TimeUnit.DAYS.toSeconds(3000*365)+ "Giay ");
        System.out.println("1.3h = "+ TimeUnit.DAYS.toHours(3000*365)+ "Hours");
        // date
        Date d =  new Date(System.currentTimeMillis()) ;
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        System.out.println(d.toString());        d.toString() ;
        // calendar
//        Calendar c = Calendar.getInstance()  ;
//        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
//        c.add(Calendar.MONTH, 30) ;
//        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
             Calendar c = Calendar.getInstance() ;
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        c.add(Calendar.HOUR,20 ) ;
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        // dateformat :)
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));
        df = new SimpleDateFormat("dd-MM-yyyy  H:m:s") ;
        System.out.println(df.format(d));
    }
}

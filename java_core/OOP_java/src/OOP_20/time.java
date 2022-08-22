package OOP_20;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

public class time {
    public static void main(String[] args) {
             long t1 = System.currentTimeMillis() ;
             for(int i=0;i<200;i++)
             {
                 System.out.println("Test tẹt ga tình ta chua chát");
             }
             long t2 = System.currentTimeMillis();
        System.out.println("Truoc khi chay for: "+ t1);
        System.out.println("Sau khi chay for: "+t2);
        System.out.println("Thoi gian: "+((t2-t1)/1000)+"s ");
        // timeUnit
        System.out.println("3000 nam = "+ TimeUnit.DAYS.toSeconds(3000*365)+"s ");
        System.out.println("25h = "+TimeUnit.HOURS.toSeconds(25)+"s");
        //Date d = new Date ;
        Date d = new Date(System.currentTimeMillis()) ;
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        // Calendar
        Calendar c = Calendar.getInstance() ;
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
    }
}

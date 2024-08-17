import java.util.Date;
import java.util.Calendar;
public class Date_Time {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);

        Calendar c = Calendar.getInstance();
        System.out.println("Calender Type" + c.getCalendarType());


    }
}

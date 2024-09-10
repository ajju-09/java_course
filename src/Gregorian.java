import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("Date :" +c.get(Calendar.DATE));
        System.out.println("Second :" +c.get(Calendar.SECOND));
        System.out.println("Hour :" +c.get(Calendar.HOUR));
        System.out.println("Train Time :" +c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2025));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[500]);
        System.out.println(TimeZone.getAvailableIDs()[100]);
    }
}

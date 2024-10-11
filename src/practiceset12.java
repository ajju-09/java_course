import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practiceset12 {
    public static void main(String[] args) {
        //Problem 1
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add("Rohan");
//        l1.add("Jugal");
//        l1.add("Harshu");
//        l1.add("Bunty");
//        l1.add("Priya");
//        l1.add("Prakash");
//        l1.add("Om");
//        l1.add("Shashank");
//        l1.add("Anirudh");
//        l1.add("Jay");
//
//        for (String element: l1){
//            System.out.print(element+",");
//        }

        //Problem 2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Problem 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Problem 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);

        //Problem 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(34);
        hs.add(44);
        hs.add(66);
        hs.add(45);
        hs.add(34);

        System.out.println(hs);
    }
}

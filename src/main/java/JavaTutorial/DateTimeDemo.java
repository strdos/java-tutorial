package JavaTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString()); //same

        SimpleDateFormat sdf = new SimpleDateFormat("M/d/Y"); // d = day in month
        SimpleDateFormat sdf2 = new SimpleDateFormat("E"); // E = day of week
        SimpleDateFormat sdf3 = new SimpleDateFormat("h:m:s     D"); // h = hour, m = minute, s = second, D = day from beginning of year
        System.out.println(sdf.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
    }
}

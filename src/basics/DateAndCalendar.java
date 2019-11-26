package basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] args) {
        // date sample
        Date now = new Date();
        System.out.println("Default date printing format: " + now);
        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE MMMM");
        System.out.println("Day of the week: " + dayOfTheWeek.format(now));
        SimpleDateFormat justTheTime = new SimpleDateFormat("H:mm:ss");
        System.out.println("Just the time: " + justTheTime.format(now));
        SimpleDateFormat justTheDate = new SimpleDateFormat("y-MM-d");
        System.out.println("Just the date: " + justTheDate.format(now));

        System.out.println();

        // calendar sample
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0 to 11 !!!
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("Now it's " + year + "/" + (month+1) + "/" + day + " " + hour + ":" + minute + ":" + second);

        System.out.println("Date before: " + cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH,+2);
        System.out.println("Date after: " + cal.getTime());
    }
}

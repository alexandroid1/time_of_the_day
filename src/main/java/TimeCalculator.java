import java.util.Calendar;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculator {

    private int minutes;
    private int hours;

    public void getTime()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        this.minutes = calendar.MINUTE;
        this.hours= calendar.HOUR_OF_DAY;
    }



/*    Calendar cal = Calendar.getInstance();
    cal.  (date);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minutes = cal.get(Calendar.MINUTE);
    if (hour == 10 && minutes >= 30 || hour == 11 && minutes <= 30) {
        ...
    }*/
}

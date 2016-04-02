import java.util.Calendar;
import java.util.Locale;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculator {

    private int hours;

    TimeCalculator(){
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void getTime()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        this.hours= calendar.get(Calendar.HOUR_OF_DAY);
    }

    public String getTimeOfTheDay()
    {
        getTime();

        if (hours > 6 && hours <= 9 ) {
            return "Good morning, World!";
        } else if (hours > 9 && hours <= 19 ) {
            return "Good day, World!";
        } else if (hours > 19 && hours <= 23 ) {
            return "Good evening, World!";
        } else if (hours > 23 && hours <= 24 || hours >= 0 && hours <= 6 ) {
            return "Good night, World!";
        }
        return "Good night, World!";
    }

    public void print(){
        System.out.println(getTimeOfTheDay());
    }

    public String getDefaultLocale() {
        return Locale.getDefault().toString();
    }
}

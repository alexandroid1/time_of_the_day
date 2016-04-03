import java.io.UnsupportedEncodingException;
import java.util.Calendar;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculator extends LocaleGetter {

    private int hours;

    TimeCalculator(){
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
        getPropertyByLocale();

        String timeFromProperty = "";

        if (hours > 6 && hours <= 9 ) {
            timeFromProperty = properties.getProperty("morning");
        } else if (hours > 9 && hours <= 19 ) {
            timeFromProperty = properties.getProperty("day");
        } else if (hours > 19 && hours <= 23 ) {
            timeFromProperty = properties.getProperty("evening");
        } else if (hours > 23 && hours <= 24 || hours >= 0 && hours <= 6 ) {
            timeFromProperty = properties.getProperty("night");
        }

        byte[] data;
        try {
            if (getDefaultLocale().equals("ru_RU")) {
                data = timeFromProperty.getBytes("ISO-8859-1");
            } else {
                data = timeFromProperty.getBytes("UTF-8");
            }
            timeFromProperty = new String(data);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return timeFromProperty;
    }

    public void print(){
        String timeOfTheDay = getTimeOfTheDay();
        System.out.println(timeOfTheDay);
    }

}

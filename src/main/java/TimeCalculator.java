import java.util.Calendar;

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

    public void getTimeOfTheDay()
    {
        getTime();

        if (hours > 6 && hours <= 9 ) {
            System.out.println("Good morning, World!");
        } else if (hours > 9 && hours <= 19 ) {
            System.out.println("Good day, World!");
        } else if (hours > 19 && hours <= 23 ) {
            System.out.println("Good evening, World!");
        } else if (hours > 23 && hours <= 24 || hours >= 0 && hours <= 6 ) {
            System.out.println("Good night, World!");
        }

    }

}

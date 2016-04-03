import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculator {

    private int hours;
    private Properties properties;

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

        if (hours > 6 && hours <= 9 ) {
            return properties.getProperty("morning");
        } else if (hours > 9 && hours <= 19 ) {
            return properties.getProperty("day");
        } else if (hours > 19 && hours <= 23 ) {
            return properties.getProperty("evening");
        } else if (hours > 23 && hours <= 24 || hours >= 0 && hours <= 6 ) {
            return properties.getProperty("night");
        }
        return properties.getProperty("night");
    }

    public void print(){

        String string = getTimeOfTheDay();
        byte[] data;
        try {
            if (getDefaultLocale().equals("ru_RU")) {
                data = string.getBytes("ISO-8859-1");
            } else {
                data = string.getBytes("UTF-8");
            }
            String str = new String(data);
            System.out.println(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getDefaultLocale() {
        return Locale.getDefault().toString();
    }

    public void getPropertyByLocale() {
        FileInputStream fis;
        Properties property = new Properties();

        try {
            String filePath = "./src/main/resources/"+getDefaultLocale()+".properties";
            fis = new FileInputStream(filePath);
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties = property;
    }
}

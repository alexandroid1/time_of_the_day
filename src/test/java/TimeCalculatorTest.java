import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculatorTest {
    @Test
    public void shouldCalculateTimeOfTheDay() {

        if (Locale.getDefault().toString().equals("ru_RU")){

            FileInputStream fis;
            Properties property = new Properties();

            try {
                String filePath = "./src/main/resources/"+Locale.getDefault().toString()+".properties";
                fis = new FileInputStream(filePath);
                property.load(fis);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String morning = property.getProperty("morning");
            String day = property.getProperty("day");
            String evening = property.getProperty("evening");
            String night = property.getProperty("night");

            try {
                byte[] morningData = morning.getBytes("ISO-8859-1");
                byte[] dayData = day.getBytes("ISO-8859-1");
                byte[] eveningData = evening.getBytes("ISO-8859-1");
                byte[] nightData = night.getBytes("ISO-8859-1");
                morning = new String(morningData);
                day = new String(dayData);
                evening = new String(eveningData);
                night = new String(nightData);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            };

            final TimeCalculator calculator = new TimeCalculator();
            String testDay = calculator.getTimeOfTheDay();

            junit.framework.Assert.assertTrue(
                    testDay.equals(morning)
                            || testDay.equals(day)
                            || testDay.equals(evening)
                            || testDay.equals(night)
            );

        } else {

            String morning = "Good morning, World!";
            String day = "Good day, World!";
            String evening = "Good evening, World!";
            String night = "Good night, World!";

            final TimeCalculator calculator = new TimeCalculator();
            String testDay = calculator.getTimeOfTheDay();

            junit.framework.Assert.assertTrue(
                    testDay.equals(morning)
                            || testDay.equals(day)
                            || testDay.equals(evening)
                            || testDay.equals(night)
            );
        }
    }
}

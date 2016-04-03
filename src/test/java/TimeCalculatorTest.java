import org.junit.Test;

import java.util.Locale;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculatorTest {
    @Test
    public void shouldCalculateTimeOfTheDay() {

        if (Locale.getDefault().toString().equals("ru_RU")){

            String morning = "Доброе утро, Мир!";
            String day = "Добрый день, Мир!";
            String evening = "Добрый вечер, Мир!";
            String night = "Спокойной ночи, Мир!";

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

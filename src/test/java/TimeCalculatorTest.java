import org.junit.Test;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeCalculatorTest {
    @Test
    public void shouldCalculateTimeOfTheDay() {

        final String morning = "Good morning, World!";
        final String day = "Good day, World!";
        final String evening = "Good evening, World!";
        final String night = "Good night, World!";

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

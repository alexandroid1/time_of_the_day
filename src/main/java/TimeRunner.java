import java.util.Locale;

/**
 * Created by ALEX on 02.04.2016.
 */
public class TimeRunner {

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        calculator.print();

        System.out.println(Locale.getDefault().toString());

    }

}

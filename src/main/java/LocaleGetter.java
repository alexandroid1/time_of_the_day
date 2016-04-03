import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by ALEX on 03.04.2016.
 */
public class LocaleGetter {
    protected Properties properties;

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

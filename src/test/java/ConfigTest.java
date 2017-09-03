import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeTest;

public class ConfigTest {

    @BeforeTest
    public void setUp() {

        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.baseUrl = "https://www.google.com.ua/";

    }
}

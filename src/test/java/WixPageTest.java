import org.openqa.selenium.By;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;


public class WixPageTest extends ConfigTest {

    GooglePage googlePage = new GooglePage();
    private WixPage wixPage = new WixPage();

    @AfterMethod
    public void closeBrowser() {
        googlePage.close();
    }

    @Test
    public void wixSiteIsTheFirstOnSearchList() {
        googlePage.open().inputSymbols("WIX");
        $(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
        System.out.println(url());
        String wixUrl = wixPage.wixUrl();
        System.out.println(wixUrl);
        assertEquals(wixUrl, "wix.com/"); //thus, can be used for both valid cases: ru.wix.com and www.wix.com
    }

    @Test
    public void wixSiteSuccessfullyLoaded() {
        open("https://www.wix.com");
        assertEquals(($(By.xpath("//*[@id=\"wm-logo\"]")).isDisplayed()), true);
        assertEquals($(By.xpath("//*[@id=\"home-fold\"]/div[2]/div/h1")).getText(), "It All Starts with Your Stunning Website");
    }
}

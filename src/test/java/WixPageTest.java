import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Screenshotter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
@Listeners({ Screenshotter.class })
public class WixPageTest extends ConfigTest {

    GooglePage mainPage = new GooglePage();
    private WixPage wixPage = new WixPage();

    @Test
    public void searchInputtedSymbols(){

        mainPage.open().inputSymbols("WIX");
        $(By.xpath("//*[@id='vs0p1c0']")).click();
        System.out.println(url());
        String wixUrl = wixPage.wixUrl();
        System.out.println(wixUrl);
        Assert.assertEquals(wixUrl,"wix.com/");

    }

}

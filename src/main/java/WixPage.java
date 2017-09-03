import static com.codeborne.selenide.WebDriverRunner.url;

public class WixPage {

    public String wixUrl(){

        WixUrlsUnificationUtility theUrl = new WixUrlsUnificationUtility();
        String ssn = url();
        String wixUrlUniversal = theUrl.pageUrlSubstringUtility(ssn,8);
        return (wixUrlUniversal);
    }

}

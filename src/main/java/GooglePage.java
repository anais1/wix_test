import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {

    public GooglePage open(){
        Selenide.open("/");
        return this;
    }

    public GooglePage close (){
        Selenide.close();
        return this;
    }

    public void inputSymbols(String symbols){
        $("#lst-ib").val(symbols).pressEnter().click();
    }
}


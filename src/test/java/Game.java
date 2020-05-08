import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Game extends BaseClass {

    @FindBy(id = "go") WebElement zaczynamyButton;
    @FindBy(id = "kop") WebElement robol;
    @FindBy(id = "ksiazka1") WebElement ksiazka1;
    @FindBy(id = "ksiazka2") WebElement ksiazka2;
    @FindBy(id = "asystentka") WebElement asystentka;
    @FindBy(id = "pracownik") WebElement pracownik;
    @FindBy(id = "kierownik") WebElement kierownik;
    @FindBy(id = "motywacja") WebElement motywacja;
    @FindBy(id = "koparka") WebElement koparka;
    @FindBy(id = "szkolenie") WebElement szkolenie;

    @Test
    public void GameTest(){
        zaczynamyButton.click();
        for (int i = 0; i<100000; i++) {
            if (ksiazka1.isDisplayed()) { ksiazka1.click(); }
            if (ksiazka2.isDisplayed()) { ksiazka2.click(); }
            if (asystentka.isDisplayed()) { asystentka.click(); }
            if (pracownik.isDisplayed()) { pracownik.click(); }
            if (kierownik.isDisplayed()) { kierownik.click(); }
            if (motywacja.isDisplayed()) { motywacja.click(); }
            if (koparka.isDisplayed()) { koparka.click(); }
            if (szkolenie.isDisplayed()) { szkolenie.click(); }
            for (int j = 0; j<125; j++) {robol.click();}
        }
    }
}

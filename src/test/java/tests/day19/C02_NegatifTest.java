package tests.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {
    @Test
    public void testNegatif() {
//        1 ) Bir Class olustur : NegativeTest
//        2) Bir test method olustur NegativeLoginTest()
//        https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();
//        login butonuna bas
        hmcPage.login.click();
//        test data username: manager1 ,
//        test data password : manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hcmWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hcmWrongPass"))
                .sendKeys(Keys.ENTER).perform();
//                Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilmadi.isDisplayed());
    }
}

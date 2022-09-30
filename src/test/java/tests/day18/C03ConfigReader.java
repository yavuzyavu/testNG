package tests.day18;

import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03ConfigReader {
    @Test
    public void test01() {


        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hcmPage = new HmcPage();
        hcmPage.login.click();
        //test data username: manager ,
        // test data password : Manager1!
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    }
}

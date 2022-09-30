package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() throws InterruptedException {
        //amazon ve facebook sayfasina gidiniz
        String urlamzn =ConfigReader.getProperty("amznUrl") ;
        String urlFace =ConfigReader.getProperty("faceUrl") ;
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Thread.sleep(2000);
        //Driver.closeDriver();

        }

}

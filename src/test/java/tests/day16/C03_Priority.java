package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    //testlerimizi calistirirken istediğimiz siraya gore calismasini istersek priority methodunu kullaniriz
    //priority kullanmaz isek default olarak  0 (sifir) dir
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("http://youtube.com");
    }

    @Test //burayi sifir kabul eder ilk burasi calisiir
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void tecproeducation() {
        driver.get("https://amazon.com");
    }
    @Test (priority = -1,groups = "grp1")
    public void hepsiBuradaTest() {
        driver.get("https://hepsiburada.com");
    }
}



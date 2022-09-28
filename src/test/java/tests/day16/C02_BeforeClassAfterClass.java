package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void amazontest() {
        driver.get("http://amazon.com");
    }

    @Test
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void tecproeducation() {
        driver.get("https://techproeducation.com");
    }
}


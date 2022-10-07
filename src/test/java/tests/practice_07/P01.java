package tests.practice_07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.WebUniversitiyPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    @Test
    public void test1() {


// http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversitiyPage webUniversitiyPage  = new WebUniversitiyPage();
        List<String> workList = new ArrayList<>(Arrays.asList("kahvalti","cocuk","bulasik","selenium","camasir","uyu"));
        Actions actions = new Actions(Driver.getDriver());
        for (String w: workList){
            actions.click(webUniversitiyPage.addNewTodo).sendKeys(w).sendKeys(Keys.ENTER).perform();


        }

//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[@class=\"nav-link\"])[7]")
    public WebElement login;
}

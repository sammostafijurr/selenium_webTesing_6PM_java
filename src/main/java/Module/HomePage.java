package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickOnHome(){
        driver.findElement(Locators.HomeBtn).click();
    }
}

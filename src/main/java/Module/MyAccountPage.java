package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnHover() {
        Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(Hover)).build().perform();
        actions.moveToElement(driver.findElement(Locators.Hover)).build().perform();
        //driver.findElement(Locators.googleId).click();
    }
    public void ClickMyAccount(){
        driver.findElement(Locators.MyAccount).click();
    }
public void ClickOnEgift(){
        driver.findElement(Locators.EGift).click();
}
}
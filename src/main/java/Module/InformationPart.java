package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InformationPart {
    WebDriver driver;
    public InformationPart(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    public void clicKOnAbout(){
        driver.findElement(Locators.About).click();
    }
    public void clicKOnSiteMap(){
        driver.findElement(Locators.SiteMap).click();
    }
    public void clicKOnCoupons(){
        driver.findElement(Locators.Coupons).click();
    }
}

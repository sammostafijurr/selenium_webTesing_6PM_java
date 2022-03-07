package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindUsOnPart {
    WebDriver driver;
    public FindUsOnPart(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    public void ClicOnInstragram(){
        driver.findElement(Locators.Instagram).click();
    }
    public void ClicOnFB(){
        driver.findElement(Locators.FaceBook).click();
    }
    public void ClicOnTwitter(){
        driver.findElement(Locators.Twitter).click();
    }
    public void ClicOnPinterest(){
        driver.findElement(Locators.Pinterst).click();
    }
    public void ClicOnYoutube(){
        driver.findElement(Locators.Youtube).click();
    }
}

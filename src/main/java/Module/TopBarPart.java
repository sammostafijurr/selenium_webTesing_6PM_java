package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TopBarPart {
    WebDriver driver;

    public TopBarPart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void ClickOnBrandsPage() {
        driver.findElement(Locators.Brand).click();
    }

    public void ClickOnShoes() {
         driver.findElement(Locators.Shoes).click();
    }
    public void ClickOnBags(){
        driver.findElement(Locators.Bags).click();
    }
    public void ClickOnAccesories(){
        driver.findElement(Locators.Aesories).click();
    }
    public void ClickOnWomen(){
        driver.findElement(Locators.women).click();
    }
    public void ClickOnMen(){
        driver.findElement(Locators.Men).click();
    }
    public void ClickOnMekid(){
        driver.findElement(Locators.kid).click();
    }
    public void ClickOnClearance(){
        driver.findElement(Locators.Clearance).click();
    }
    public void ClickOnClothing(){
        driver.findElement(Locators.clothing).click();
    }
    public void ClickOnEgift(){
        driver.findElement(Locators.EGift).click();
    }


}



package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MiddlePart {
    WebDriver driver;

    public MiddlePart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void OnSteveShop(){
        driver.findElement(Locators.ShopSteve).click();
    }
    public void OnShopBabe(){
        driver.findElement(Locators.ShopBebe).click();
    }
    public void OnShopKolaburra(){
        driver.findElement(Locators.ShopKolaBura).click();
    }
    public void OnShopRoss(){
        driver.findElement(Locators.ShopRoss).click();
    }
    public void OnshopSandle (){
        driver.findElement(Locators.ShopSandle).click();
    }
    public void OnshopSneaker(){
        driver.findElement(Locators.ShopSneaker).click();
    }
    public void OnshopNow(){
        driver.findElement(Locators.ShopNow).click();
    }


}

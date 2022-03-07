package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePart {
    WebDriver driver;
    public CustomerServicePart(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    //Forgot Password
    public void forgetPassword(){
        driver.findElement(Locators.Forgetpassword).click();
    }


    public void Shippingrate(){
        driver.findElement(Locators.ShippingRate).click();
    }
    public void ReturnPolisy(){
        driver.findElement(Locators.ReturnPolisy).click();
    }
    public void preposition(){
        driver.findElement(Locators.AboutProposition).click();
    }
    public void FaQ(){
        driver.findElement(Locators.FaQ);
    }
    public void ContactInfo(){
        driver.findElement(Locators.ContactInfo);
    }
}

package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignInPart {
    WebDriver driver;
    public SignInPart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnHover() {
        Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(Hover)).build().perform();
        actions.moveToElement(driver.findElement(Locators.Hover)).build().perform();
        //driver.findElement(Locators.googleId).click();
    }
    public void clickLogin(){
        driver.findElement(Locators.Login).click();
    }
    public void  Email(String email){
        driver.findElement(Locators.Email).sendKeys(email);

    }
    public void Password(String pass)
    {
        driver.findElement(Locators.Password).sendKeys(pass);
    }
    public void Sign()
   {
        driver.findElement(Locators.SignIn).click();
}
    public void Amazon()
{
        driver.findElement(Locators.Amazon).click();
}
    public void Create(){
        driver.findElement(Locators.CreateAccount).click();
}

    public void AmaEmail(String email){
        driver.findElement(Locators.AmaEmail).sendKeys(email);
}
    public void AmaPass(String pass){
        driver.findElement(Locators.AmaPass).sendKeys(pass);
}
    public void AmaSign(){
        driver.findElement(Locators.AmaSign).click();
}
    public void CustomerName(String name){
        driver.findElement(Locators.CustomerName).sendKeys(name);
}
    public void CustomerEmail(String email){
        driver.findElement(Locators.CustomerEmail).sendKeys(email);
}
    public void customerPass(String pass){
        driver.findElement(Locators.CustomerPass).sendKeys(pass);
}
    public void RepassWword(String Repass){
        driver.findElement(Locators.RepassWord).sendKeys(Repass);
}
    public void Done(){
        driver.findElement(Locators.CustomerDone).click();
}
   public void LogOut(){
        driver.findElement(Locators.Logout).click();
}
}

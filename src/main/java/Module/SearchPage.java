package Module;

import Model.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   public void ClikOnsearhTextBox(String searchText){
        driver.findElement(Locators.searh).sendKeys(searchText);
   }
   public void ClikOnSearhBar(){
        driver.findElement(Locators.searhBtn).click();
   }

}

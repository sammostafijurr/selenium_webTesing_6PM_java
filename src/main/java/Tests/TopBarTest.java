package Tests;
import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.*;
import org.testng.annotations.Test;

@Test(priority = 1)
public class TopBarTest extends BaseTests {
    public void shoes(){
        TopBarPart shoesbar = new TopBarPart(driver);
        try {
            shoesbar.ClickOnShoes();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 2)
    public void Clothing(){
        TopBarPart ClothingBar = new TopBarPart(driver);
        try {
            ClothingBar.ClickOnClothing();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 3 )
    public void Bags(){
        TopBarPart Bagbar = new TopBarPart(driver);
        try {
            Bagbar.ClickOnBags();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 4)
    public void Aessories (){
        TopBarPart Aessories = new TopBarPart(driver);
        try {
            Aessories.ClickOnAccesories();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 5)
    public void Women (){
        TopBarPart womenbar = new TopBarPart(driver);
        try {
            womenbar.ClickOnWomen();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 6)
    public void Men (){
        TopBarPart Menbar = new TopBarPart(driver);
        try {
            Menbar.ClickOnMen();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 7)
    public void Kid (){
        TopBarPart kidbar = new TopBarPart(driver);
        try {
            kidbar.ClickOnMekid();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 8)
    public void clearance (){
        TopBarPart clearanceBar = new TopBarPart(driver);
        try {
            clearanceBar.ClickOnClearance();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test(priority = 9)
    public void brand (){
        TopBarPart Brandbar = new TopBarPart(driver);
        try {
            Brandbar.ClickOnBrandsPage();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
@Test(priority = 10)
    public void Egift (){
        TopBarPart Brandbar = new TopBarPart(driver);
        try {
            Brandbar.ClickOnEgift();
            Timout.timeslow();


        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
}

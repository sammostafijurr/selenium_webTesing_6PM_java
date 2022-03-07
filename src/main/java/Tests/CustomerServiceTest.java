package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.CustomerServicePart;
import Module.HomePage;
import org.testng.annotations.Test;

@Test(priority = 1)
public class CustomerServiceTest extends BaseTests {
    public void forgetpassword() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
       // HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
           servicePage.forgetPassword();
            Timout.timeout();
            //homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 2)
    public void shippingRate() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
       // HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            servicePage.Shippingrate();
            Timout.timeout();
           // homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 3)
    public void ReturnPolisy() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
       // HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            servicePage.ReturnPolisy();
            Timout.timeout();
         //   homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 4)
    public void AboutProposition() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
        //HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            servicePage.preposition();
            Timout.timeout();
           // homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 5)
    public void FaQ() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
       // HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            servicePage.FaQ();
            Timout.timeout();
           // homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 6)
    public void Info() {
        CustomerServicePart servicePage = new CustomerServicePart(driver);
       // HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            servicePage.ContactInfo();
            Timout.timeout();
            //homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
}

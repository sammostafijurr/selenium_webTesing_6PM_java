package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.SignInPart;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest extends BaseTests {
    CommonMethods commonMethods = new CommonMethods(driver);


    @Test(priority = 1)
    public void CreateAccount() {
        {
            SignInPart SignPage = new SignInPart(driver);
            Timout.timeout();
            // LoginPage loginPage = homePage.clickSignInButton();
            try {
                SignPage.clickOnHover();
                Timout.timeout();
                SignPage.clickLogin();
                //Timout.timeout();
                SignPage.Create();
                Timout.timeout();
                SignPage.CustomerName("Rony Ahmedd");
                Timout.timeout();
                SignPage.CustomerEmail("ronycse4th@gmail.com");
                Timout.timeout();
                SignPage.customerPass("6AMautomation");
                Timout.timeout();
                SignPage.RepassWword("6AMautomation");
                Timout.timeout();
                SignPage.Done();
                System.out.println(commonMethods.getTitle());
            } catch (Exception e) {
                CommonMethods commonMethods = new CommonMethods(driver);
                commonMethods.back();
            }
        }
    }

    @Test(priority = 2)
    public void LoginWithAmazon() {
        {
            SignInPart SignPage = new SignInPart(driver);
            Timout.timeout();
            // LoginPage loginPage = homePage.clickSignInButton();
            try {

                SignPage.Amazon();
                Timout.timeout();
                SignPage.AmaEmail("sammostafijurr@gmail.com");
                SignPage.AmaPass("6AMautomation");
                SignPage.AmaSign();
                SignPage.clickOnHover();
                SignPage.LogOut();
                System.out.println(commonMethods.getTitle());
            } catch (Exception e) {
                CommonMethods commonMethods = new CommonMethods(driver);
                commonMethods.back();
            }
        }

    }
}
   // @Test(priority = 3)
    //public void myAccount(){
      //  MyAccountPage myAccountPage = new MyAccountPage(driver);
       // SignInPage SignPage = new SignInPage(driver);

        //Timout.timeout();
        //try {
          //  myAccountPage.clickOnHover();
            //Timout.timeout();
            //myAccountPage.ClickMyAccount();
            //SignPage.Email("sammostafijurr@gmail.com");
            //Timout.timeout();
            //SignPage.Password("6PMautomation");
            //Timout.timeout();
            //SignPage.Sign();
            //Timout.timeslow();

        //}catch (Exception e) {
          //  CommonMethods commonMethods = new CommonMethods(driver);
         //   commonMethods.back();
        //}
    //}
//}

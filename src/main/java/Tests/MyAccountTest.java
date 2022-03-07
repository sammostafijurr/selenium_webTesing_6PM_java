package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.MyAccountPage;
import Module.SignInPart;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTests {


    @Test
    public void myAccount() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        SignInPart SignPage = new SignInPart(driver);

        Timout.timeout();
        try {
            myAccountPage.clickOnHover();
            Timout.timeout();
            myAccountPage.ClickMyAccount();
            SignPage.Email("sammostafijurr@gmail.com");
            Timout.timeout();
            SignPage.Password("6PMautomation");
            Timout.timeout();
            SignPage.Sign();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }


}



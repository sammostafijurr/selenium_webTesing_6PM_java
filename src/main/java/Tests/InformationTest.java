package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.InformationPart;
import org.testng.annotations.Test;

public class InformationTest extends BaseTests {
    @Test(priority = 1)
    public void AboutBTN() {
        InformationPart informationPage = new InformationPart(driver);
        try {

            informationPage.clicKOnAbout();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }
    }
@Test(priority = 2)
    public void siteMap() {
        InformationPart informationPage = new InformationPart(driver);
        try {
            informationPage.clicKOnSiteMap();
            Timout.timeout();


        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
@Test(priority = 3)
    public void coupuns() {
        InformationPart informationPage = new InformationPart(driver);
        try {
            informationPage.clicKOnCoupons();
            Timout.timeout();
        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }
    }
}
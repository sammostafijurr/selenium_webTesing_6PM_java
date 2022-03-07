package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.FindUsOnPart;
import org.testng.annotations.Test;

public class FindUsTest extends BaseTests {
    @Test(priority = 1)
    public void Instagram() {
        FindUsOnPart findousPage = new FindUsOnPart(driver);
        try {
            findousPage.ClicOnInstragram();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }

    }
    @Test(priority = 2)
    public void FB() {
        FindUsOnPart findousPage = new FindUsOnPart(driver);
        try {
            findousPage.ClicOnFB();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }

    }
    @Test(priority = 3)
    public void Twitter() {
        FindUsOnPart findousPage = new FindUsOnPart(driver);
        try {
            findousPage.ClicOnTwitter();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }

    }
    @Test(priority = 4)
    public void Pinterst() {
        FindUsOnPart findousPage = new FindUsOnPart(driver);
        try {
            findousPage.ClicOnPinterest();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }

    }
    @Test(priority = 5)
    public void Youtube() {
        FindUsOnPart findousPage = new FindUsOnPart(driver);
        try {
            findousPage.ClicOnYoutube();
            Timout.timeslow();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();

        }

    }
}
package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.HomePage;
import Module.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseTests {
    @Test
    public void searchBar() {
        SearchPage searchPager = new SearchPage(driver);
        HomePage homebutton = new HomePage(driver);
        Timout.timeout();
        try {
            searchPager.ClikOnsearhTextBox("Laptop Bag");
            searchPager.ClikOnSearhBar();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
}
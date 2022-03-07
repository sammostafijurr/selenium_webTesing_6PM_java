package Base;

import Model.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;


public class BaseTests {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Locators.homePageUrl);
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}

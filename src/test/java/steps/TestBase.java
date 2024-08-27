package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestBase {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    public static void launchBrowser(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
       driver.get("https://medsultoadmin-staging1.azurewebsites.net/auth/login");
    driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

    @BeforeMethod

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://medsultoadmin-staging1.azurewebsites.net/auth/login");

        // Initialize Page Objects after the page is loaded

    }



    @AfterMethod
    public  void quit(){

    }
}
package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.PageBases;

public class LoginSteps extends TestBase {
LoginPage loginPage;



    @Given("User open website and go to login page")
    public void user_open_website_and_go_to_login_page() {
        launchBrowser();
        loginPage = new LoginPage(driver);
    }

    @When("User fill {string} and {string} and click on login")
    public void user_fill_email_and_password_and_click_on_login(String email,String password) {
     loginPage.user_fill_email_and_password_and_click_on_login(email,password);
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {
       loginPage.user_should_navigate_to_home_page();
    }

}

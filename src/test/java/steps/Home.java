package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class Home extends TestBase{
HomePage homePage;

    @When("User click on Benefit")
    public void user_click_on_benefit() {
    homePage = new HomePage(driver);
      homePage.user_click_on_benefit();
    }

    @And("User selects Benefit List from the dropdown")
    public void user_selects_benefit_list_from_the_dropdown() {
     homePage.user_selects_benefit_list_from_the_dropdown();
    }

    @Then("User should navigate to Benefits List page")
    public void user_should_navigate_to_benefit_list_page() {
        homePage = new HomePage(driver);
      homePage.user_should_navigate_to_benefit_list_page();
    }
}

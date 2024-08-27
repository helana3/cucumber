package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BenefitPage;
import pages.LoginPage;


public class Benefit extends TestBase {
BenefitPage benefitPage;

    @And("User clicks on the Add Benefit button")
    public  void click_on_add_benefit_button(){
     benefitPage = new BenefitPage(driver);
      benefitPage.click_on_add_benefit_button();
    }

    @Then("User should navigate to the Add Benefit page")
    public void user_should_navigate_to_add_benefit_page() {
       benefitPage.user_should_navigate_to_add_benefit_page();
    }
}

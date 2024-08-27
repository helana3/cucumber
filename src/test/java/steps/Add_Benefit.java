package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddBenefitPage;
import pages.BenefitPage;

import java.time.Duration;

public class Add_Benefit extends TestBase {

 AddBenefitPage addBenefitPage;

    @When("User fill title {string}")
    public   void  User_fill_Title(String title){
        addBenefitPage = new AddBenefitPage(driver);
        addBenefitPage.User_fill_Title(title);
    }

    @And("User fill sub title {string}")
    public void  User_fill_Sub_Title(String subTitle)
    {
     addBenefitPage.User_fill_Sub_Title(subTitle);
    }



    @And("User select the Benefit Type")
    public void user_selects_the_Benefit_Type() {
      addBenefitPage.user_selects_the_Benefit_Type();
    }


    @And("User selects the Countries")
    public void user_selects_the_Countries() {
        addBenefitPage.user_selects_the_Countries();
    }





    @And("User fill the Profession")
    public void user_selects_the_profession() {
             addBenefitPage.user_selects_the_profession();
    }

    @And("User fill the Brief Description {string}")
    public  void  User_fill_Brief_Description(String Brief_Descriptions){
        addBenefitPage.User_fill_Brief_Description(Brief_Descriptions);
    }



    @And("User fill the details {string}")
    public  void  User_fill_details(String details){

        addBenefitPage.User_fill_details(details);
    }



    @And("User Choose file1")
    public void uploadImage1() {

        addBenefitPage.uploadImage1();
    }


    @And("User Choose file2")
    public void uploadImage2() {
     addBenefitPage.uploadImage2();
    }


    @And("User click on save button")
    public  void save_btn() throws InterruptedException {
       addBenefitPage.save_btn();
    }


    @When("User Click on search field and enter any {string}")
    public  void  User_Click_on_search_field(String search_title) throws InterruptedException {
      addBenefitPage.User_Click_on_search_field(search_title);
    }


    @And("click on search button")
    public  void search_btn(){
        addBenefitPage = new AddBenefitPage(driver);
   addBenefitPage.search_btn();
    }



   @And("Click on the benefit")
    public void click_on_the_benefit() {
    addBenefitPage.click_on_the_benefit();
    }


    @Then("User should navigate to Benefit Details page")
    public void user_should_navigate_to_benefit_details_page() throws InterruptedException {
    addBenefitPage.user_should_navigate_to_benefit_details_page();
    }


    @And("User click on edit button")
    public void edit_btn() throws InterruptedException {
    addBenefitPage.edit_btn();
    }

}

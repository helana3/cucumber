package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddBenefitPage;
import pages.EditPage;


public class editSteps extends TestBase {
EditPage editPage;

    @Then("User navigate to the Edit Benefit page")
    public  void User_navigate_to_edit_page() throws InterruptedException {
        editPage = new EditPage(driver);
    editPage.User_navigate_to_edit_page();
    }


    @And("User edit the title{string}")
    public  void User_edit_the_title(String title) throws InterruptedException {
        editPage = new EditPage(driver);
     editPage.User_edit_the_title(title);
    }


    @And("User Click on the edit save button")
    public  void User_Click_on_the_edit_save_button() throws InterruptedException{
   editPage.User_Click_on_the_edit_save_button();
    }

    @And("User should navigate to Benefits List page After editing")
    public void user_should_navigate_to_benefit_list_page_After_editing() throws InterruptedException {
      editPage.user_should_navigate_to_benefit_list_page_After_editing();
    }


    @When("User Click on the search field and enter the editing title {string}")
    public void User_Click_on_search_field_and_enter_the_editing_title(String editing_title) throws InterruptedException {
      editPage.User_Click_on_search_field_and_enter_the_editing_title(editing_title);
    }



}

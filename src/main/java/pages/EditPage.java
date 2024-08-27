package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditPage extends  PageBases{
    public EditPage(WebDriver driver) {
        super(driver);
    }

    public  void User_navigate_to_edit_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(3000);
        WebElement EditBenefit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Edit Benefit\"]")));
        assert EditBenefit.isDisplayed();
    }



    public void User_edit_the_title(String editingTitle) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        Thread.sleep(3000);
        WebElement editTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Benefit Title']")));
        editTitle.click();
        editTitle.clear();
        editTitle.sendKeys(editingTitle);
    }



    public  void User_Click_on_the_edit_save_button() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement saveEditButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-add-edit-benefit/div[1]/div/div/div/div[2]/button[1]")));
        saveEditButton.click();
    }


    public void user_should_navigate_to_benefit_list_page_After_editing() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement benefitPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Benefits List\"]")));
        assert benefitPage.isDisplayed();
    }



    public void User_Click_on_search_field_and_enter_the_editing_title(String  editingTitleInSearchField) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(2000);
        WebElement searchAfterEditing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"src_txt\"]")));
        searchAfterEditing.click();
        searchAfterEditing.sendKeys(editingTitleInSearchField);
    }
}

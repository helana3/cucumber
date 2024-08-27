package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BenefitPage extends PageBases{
    public BenefitPage(WebDriver driver) {
        super(driver);
    }


    public  void click_on_add_benefit_button(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-spinner-overlay")));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-neutral']")));
        addButton.click();
    }


    public void user_should_navigate_to_add_benefit_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement addBenefitPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Add Benefit\"]")));
        assert addBenefitPage.isDisplayed();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBases{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void user_click_on_benefit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement benefitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidenav-collapse-main']/ul/li[4]/a")));
        benefitButton.click();
    }


    public void user_selects_benefit_list_from_the_dropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement benefitListLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@ng-reflect-router-link='benefits']")));
        benefitListLink.click();
    }


    public void user_should_navigate_to_benefit_list_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement benefitPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Benefits List\"]")));
        assert benefitPage.isDisplayed();
    }
}

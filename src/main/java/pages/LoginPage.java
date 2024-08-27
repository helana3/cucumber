package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageBases {

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public void user_fill_email_and_password_and_click_on_login(String userName,String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"email\"]")));
        emailField.sendKeys(userName);
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"password\"]")));
        passwordField.sendKeys(password);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
        loginButton.click();
    }


    public void user_should_navigate_to_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement homePageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Medsulto Doctors List\"]")));
        Assert.assertTrue(homePageElement.isDisplayed());
    }
}

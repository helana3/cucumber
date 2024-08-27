package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddBenefitPage extends  PageBases{
    public AddBenefitPage(WebDriver driver) {
        super(driver);
    }

    public  void  User_fill_Title(String titleName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fillTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"title\"]")));
        fillTitle.click();
        fillTitle.sendKeys(titleName);
    }


    public  void  User_fill_Sub_Title(String subTitle){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fillTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"subTitle\"]")));
        fillTitle.click();
        fillTitle.sendKeys(subTitle);
    }



    public void user_selects_the_Benefit_Type() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for the dropdown to be clickable and click on it
        WebElement benefitTypeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-add-edit-benefit/div[2]/form/div/div[1]/div/div/div[2]/div/div[4]/div/ng-select/div/span")));
        benefitTypeDropdown.click();

        // Wait for the dropdown options to be visible and click on the desired option
        WebElement benefitTypeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@ng-reflect-ng-item-label=\"CME\"]")));
        benefitTypeOption.click();
    }



    public void user_selects_the_Countries() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-add-edit-benefit/div[2]/form/div/div[1]/div/div/div[2]/div/div[5]/div/app-multi-select/ng-select/div/div/div[2]/input")));
        countryDropdown.click();
        WebElement countryOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-1\"]"))); // Replace 'CityName' with the actual name of the city you want to select
        countryOption.click();

    }






    public void user_selects_the_profession() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open the country dropdown
        WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-add-edit-benefit/div[2]/form/div/div[1]/div/div/div[2]/div/div[6]/div/app-multi-select/ng-select")));
        countryDropdown.click();

        // Wait for the dropdown options to be visible and select the desired country
        WebElement countryOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-0\"]"))); // Replace 'CityName' with the actual name of the city you want to select
        countryOption.click();


    }


    public  void  User_fill_Brief_Description(String briefDescription){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fillTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"briefDescription\"]")));
        fillTitle.click();
        fillTitle.sendKeys(briefDescription);
    }




    public  void  User_fill_details(String details){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fillTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"editor\"]/div[2]/div[2]/div")));
        fillTitle.click();
        fillTitle.sendKeys(details);
    }




    public void uploadImage1() {
        String imageName="Capture.PNG";
        String imagePath=System.getProperty("user.dir")+"/Uploads/"+imageName;
        WebElement fileUpLoader=driver.findElement(By.id("projectCoverUploads"));
        fileUpLoader.sendKeys(imagePath);
    }



    public  void uploadImage2() {
        String imageName="Capture.PNG";
        String imagePath=System.getProperty("user.dir")+"/Uploads/"+imageName;
        WebElement fileUpLoader=driver.findElement(By.id("customFileUploadMultiple"));
        fileUpLoader.sendKeys(imagePath);
    }



    public  void save_btn() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        Thread.sleep(2000);
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-add-edit-benefit/div[1]/div/div/div/div[2]/button[1]")));
        saveButton.click();
    }



    public void  User_Click_on_search_field(String searchName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(2000);
        WebElement fillTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"src_txt\"]")));
        fillTitle.click();
        fillTitle.sendKeys(searchName);
    }



    public void search_btn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-benefits-list/div/div/div[1]/div[2]/div[2]/button")));
        searchButton.click();
    }



    public void click_on_the_benefit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement benefitElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title=\"HelanaBenefit\" and @class=\"ng-star-inserted\"][1]")));
        benefitElement.click();
    }



    public void user_should_navigate_to_benefit_details_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(4000);
        WebElement benefitDetailsPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()=\" Benefit Details\"]")));
        assert benefitDetailsPage.isDisplayed();
    }



    public void edit_btn() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(2000);
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-benefit-details/div/div/div/div[1]/div[2]")));
        editButton.click();
    }
}

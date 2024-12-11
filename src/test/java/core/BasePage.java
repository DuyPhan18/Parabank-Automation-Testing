package core;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private WebDriverWait waitWithSpecificTimeout;


    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
        PageFactory.initElements(driver, this);
    }
    public void navigateToHomePage(){
        driver.navigate().to(Constants.HOMEPAGE_URL);
    }
    public void sendKeyTo(WebElement element, String text){
        try {
           isElementVisibility(element);
            element.sendKeys(text);
        }catch (TimeoutException e){
            System.out.println(e);
        }
    }
    public void clickToElement(WebElement element){
        try {
            isElementVisibility(element);
            element.click();
        }catch (TimeoutException e){
            System.out.println("Error" + e);
        }
    }
    public boolean isElementVisibility(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }



}

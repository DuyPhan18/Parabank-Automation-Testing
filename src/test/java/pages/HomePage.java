package pages;

import core.BasePage;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "username")
    private WebElement userNameInput;
    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordInput;
    @FindBy(how = How.XPATH, using = "//div[@class='login']/input[@type='submit']")
    private WebElement loginBtn;

    public void enterUserNameAndPassword(){
        sendKeyTo(userNameInput, Constants.username);
        sendKeyTo(passwordInput, Constants.password);
    }

    public void clickToBtn(){
        clickToElement(loginBtn);
    }



}

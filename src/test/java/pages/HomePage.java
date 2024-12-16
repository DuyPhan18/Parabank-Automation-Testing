package pages;

import core.BasePage;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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
    @FindBy(how = How.XPATH, using = "//a[text()='Register']")
    private WebElement registerBtn;
    @FindBy(how = How.ID, using = "customer.firstName")
    private WebElement firstNameInput;
    @FindBy(how = How.ID, using = "customer.lastName")
    private WebElement lastNameInput;
    @FindBy(how = How.ID, using = "customer.address.street")
    private WebElement addressInput;
    @FindBy(how = How.ID, using = "customer.address.city")
    private WebElement cityInput;
    @FindBy(how = How.ID, using = "customer.address.state")
    private WebElement stateInput;
    @FindBy(how = How.ID, using = "customer.address.zipCode")
    private WebElement zipCodeInput;
    @FindBy(how = How.ID, using = "customer.phoneNumber")
    private WebElement phoneInput;
    @FindBy(how = How.ID, using = "customer.ssn")
    private WebElement ssnInput;
    @FindBy(how = How.ID, using = "customer.username")
    private WebElement userNameRegisterInput;
    @FindBy(how = How.ID, using = "customer.password")
    private WebElement passwordRegisterInput;
    @FindBy(how = How.ID, using = "repeatedPassword")
    private WebElement repeatPasswordRegisterInput;
    @FindBy(how = How.XPATH, using = "//input[@value='Register']")
    private WebElement registerSubmitBtn;
    @FindBy(how = How.XPATH, using = "//span[@class='error']")
    private List<WebElement> errorRegisterList;

    public void enterUserNameAndPassword() {
        sendKeyTo(userNameInput, Constants.username);
        sendKeyTo(passwordInput, Constants.password);
    }

    public void clickToLoginBtn() {
        clickToElement(loginBtn);
    }

    public void openRegisterForm() {
        clickToElement(registerBtn);
    }

    public void sendKeyToRegisterForm(String firstName, String lastName, String address, String city,
                                      String state, String zipCode, String phone, String ssn, String username, String pass) {
        sendKeyTo(firstNameInput, firstName);
        sendKeyTo(lastNameInput, lastName);
        sendKeyTo(addressInput, address);
        sendKeyTo(cityInput, city);
        sendKeyTo(stateInput, state);
        sendKeyTo(zipCodeInput, zipCode); // Nếu zipCode = 0, gửi chuỗi rỗng
        sendKeyTo(phoneInput, phone);       // Nếu phone = 0, gửi chuỗi rỗng
        sendKeyTo(ssnInput,ssn);
        sendKeyTo(userNameRegisterInput, username);
        sendKeyTo(passwordRegisterInput, pass);
        sendKeyTo(repeatPasswordRegisterInput, pass);
    }

    public void clickToRighterSubmitBtn() {
        clickToElement(registerSubmitBtn);
    }


    public boolean isErrorDisplayed(String expectedErrorMessage) {
        for (WebElement error : errorRegisterList) {
           if (error.getText().equals(expectedErrorMessage)){
               return true;
           }
        }
        return false;
    }
}


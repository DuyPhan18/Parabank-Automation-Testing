package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountServicesPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//p=[@class='smallText']")
    private WebElement welcomeTextElm;
    @FindBy(how = How.ID, using = "leftPanel")
    private WebElement leftPanel;
    @FindBy(how = How.ID, using = "rightPanel")
    private WebElement rightPanel;
    @FindBy(how = How.XPATH, using = "//a[text()='Accounts Overview']")
    private WebElement accountsOverviewBtn;
    @FindBy(how = How.XPATH, using = "//a[text()='Transfer Funds']")
    private WebElement transferFundsBtn;
    @FindBy(how = How.XPATH, using = "//a[text()='Find Transactions']")
    private WebElement findTransactionsBtn;
    @FindBy(how = How.XPATH, using = "//input[@id='amount']")
    private WebElement amountInput;
    @FindBy(how = How.ID, using = "fromAccountId")
    private WebElement fromAccountIdSelect;
    @FindBy(how = How.ID, using = "toAccountId")
    private WebElement toAccountIdSelect;
    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement transferBtn;
    @FindBy(how = How.XPATH, using = "//a[text()='Log Out']")
    private WebElement logOutBtn;

    public AccountServicesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedSuccess(){
        return isElementVisibility(welcomeTextElm);
    }
    public boolean isPanelDisplay(){
        return isElementVisibility(leftPanel) && isElementVisibility(rightPanel);
    }
}

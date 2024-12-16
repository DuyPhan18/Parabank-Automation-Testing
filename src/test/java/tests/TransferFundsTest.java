package tests;

import core.BaseTest;
import core.Constants;
import core.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountServicesPage;
import pages.HomePage;

public class TransferFundsTest extends BaseTest {
    @Test
    public void LoginWithInvalidData() {
        HomePage homePage = new HomePage(getDriver());

        homePage.navigateToHomePage();
        homePage.enterUserNameAndPassword();
        homePage.clickToLoginBtn();
    }
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = "TestData")
    public void TransferFundWithValidAmount(String testCaseId, String amount){
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

        accountServicesPage.openTransferFundPage();
        accountServicesPage.enterAmount(amount);
        accountServicesPage.selectFromAccount();
        accountServicesPage.selectToAccount();
        accountServicesPage.clickToTransferBtn();
        Assert.assertTrue(accountServicesPage.isTransferCompleted(),"Transfer MSG" + Constants.IS_NOT_DISPLAYED);
    }
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = "TestData")
    public void TransferFundWithInvalidAmount(String testCaseId, String amount){
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());
    }
}

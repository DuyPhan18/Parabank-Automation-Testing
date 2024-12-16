package tests;

import core.BaseTest;
import core.Constants;
import core.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountServicesPage;
import pages.HomePage;

public class LoginPageTest extends BaseTest {
//    @Test(priority = 1)
//    public void LoginWithBlankData(){
//        HomePage homePage = new HomePage(getDriver());
//        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());
//
//        homePage.navigateToHomePage();
//        homePage.enterUserNameAndPassword();
//        homePage.clickToLoginBtn();
//        Assert.assertTrue(accountServicesPage.isLoggedSuccess(), "Text" + Constants.IS_NOT_DISPLAYED);
//
//
//    }
    @Test(priority = 2)
    public void LoginWithInvalidData(){
        HomePage homePage = new HomePage(getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

        homePage.navigateToHomePage();
        homePage.enterUserNameAndPassword();
        homePage.clickToLoginBtn();
        Assert.assertTrue(accountServicesPage.isLoggedSuccess(), "Text" + Constants.IS_NOT_DISPLAYED);


    }
}

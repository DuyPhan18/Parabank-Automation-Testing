package tests;

import core.BaseTest;
import core.Constants;
import core.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountServicesPage;
import pages.HomePage;

public class RegisterPageTest extends BaseTest {
    @Test(priority = 1)
    public void RegisterWithBlankDataTest(){
        HomePage homePage = new HomePage(getDriver());

        homePage.navigateToHomePage();
        homePage.openRegisterForm();
        homePage.sendKeyToRegisterForm("", "", "","", "", "","", "", "","");
        homePage.clickToRighterSubmitBtn();
        Assert.assertTrue(homePage.isErrorDisplayed("First name" + Constants.IS_REQUIRED),"First name" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Last name" + Constants.IS_REQUIRED),"Last name" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Address" + Constants.IS_REQUIRED),"Address" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("City" + Constants.IS_REQUIRED),"City" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Zip Code" + Constants.IS_REQUIRED),"Zip Code" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Social Security Number" + Constants.IS_REQUIRED),"Social Security Number" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Username" + Constants.IS_REQUIRED),"Username" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Password" + Constants.IS_REQUIRED),"Password" + Constants.IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isErrorDisplayed("Password confirmation" + Constants.IS_REQUIRED),"Password confirmation" + Constants.IS_NOT_DISPLAYED);

    }
    @Test(priority = 2, dataProviderClass = DataProviderUtils.class, dataProvider = "TestData")
    public void RegisterWithValidDataTest(String firstName, String lastName, String address, String city,
                                          String state, String zipCode, String phone, String ssn, String username, String pass){
        HomePage homePage = new HomePage(getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

        homePage.navigateToHomePage();
        homePage.openRegisterForm();
        homePage.sendKeyToRegisterForm(firstName, lastName, address, city, state, zipCode, phone, ssn, username, pass);
        homePage.clickToRighterSubmitBtn();
        Assert.assertTrue(accountServicesPage.isLoggedSuccess(), "Text" + Constants.IS_NOT_DISPLAYED);
    }
}

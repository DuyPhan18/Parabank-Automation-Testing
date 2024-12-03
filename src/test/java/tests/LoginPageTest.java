package tests;

import core.BaseTest;
import core.DataProviderUtils;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginPageTest extends BaseTest {
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = "testData")
    public void LoginWithInvalidData(String username, String pass){
        HomePage homePage = new HomePage(getDriver());

    }
}

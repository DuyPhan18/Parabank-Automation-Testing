package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterPageTest extends BaseTest {
    @Test
    public void RegisterWithBlankDataTest(){

    }
    @Test
    public void RegisterWithValidDataTest(String user, String pass){
        HomePage homePage = new HomePage(getDriver());

    }
}

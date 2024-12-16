package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.AccountServicesPage;

public class AccountOverviewTest extends BaseTest {
    @Test
    public void checkAccountAndAmount(){
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

    }
}

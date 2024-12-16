package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.AccountServicesPage;

public class TransactionHistoryTest extends BaseTest {
    @Test
    public void checkTransactionById(){
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

        accountServicesPage.openTransactionPage();
    }
    @Test
    public void checkTransactionByAmount(){
        AccountServicesPage accountServicesPage = new AccountServicesPage(getDriver());

        accountServicesPage.openTransactionPage();
    }
}

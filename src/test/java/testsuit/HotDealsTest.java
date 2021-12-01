package testsuit;

import org.testng.annotations.Test;
import pages.*;
import testbase.TestBase;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewArrivalsPage newArrivalsPage = new NewArrivalsPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    SalePage salePage = new SalePage();
    BestSellersPage bestSellersPage = new BestSellersPage();


    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        homePage.clickOnSaleSubPage();
        salePage.verifyUserIsOnSalePage();
        salePage.clickOnSortByAToZAndVerify();

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

        homePage.clickOnSaleSubPage();
        salePage.verifyUserIsOnSalePage();
        salePage.clickOnSortByHighToLowAndVerify();

    }

    @Test
    public void verifySalesProductsArrangedByRates() throws InterruptedException {

        homePage.clickOnSaleSubPage();
        salePage.verifyUserIsOnSalePage();
        salePage.clickOnSortByRatesAndVerify();

    }


    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        homePage.clickOnBestSellersSubPage();
        bestSellersPage.verifyUserIsOnBestSellersPage();
        bestSellersPage.clickOnSortByZtoAAndVerifyBestSellers();

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.clickOnBestSellersSubPage();
        bestSellersPage.verifyUserIsOnBestSellersPage();
        bestSellersPage.clickOnSortByHighToLowAndVerifyBestSellers();

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates () throws InterruptedException{
        homePage.clickOnBestSellersSubPage();
        bestSellersPage.verifyUserIsOnBestSellersPage();
        bestSellersPage.clickOnSortByRatesAndVerify();
    }

}

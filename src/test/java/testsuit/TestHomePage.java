package testsuit;

import org.testng.annotations.Test;
import pages.*;
import testbase.TestBase;

public class TestHomePage extends TestBase {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewArrivalsPage newArrivalsPage = new NewArrivalsPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
        homePage.clickOnShippingPage();
        Thread.sleep(2000);
        shippingPage.verifyUserIsOnShippingPage();
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
        homePage.clickOnNewArrivalsPage();
        Thread.sleep(2000);
        newArrivalsPage.verifyUserIsOnNewArrivalsPage();
    }


    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() throws InterruptedException {
        homePage.clickOnComingSoonPage();
        Thread.sleep(2000);
        comingSoonPage.verifyUserIsOnComingSoonPage();
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {
        homePage.clickOnContactUsPage();
        Thread.sleep(2000);
        contactUsPage.verifyUserIsOnContactUsPage();
    }

}

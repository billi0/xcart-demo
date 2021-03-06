package testsuit;

import org.testng.annotations.Test;
import pages.*;
import testbase.TestBase;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewArrivalsPage newArrivalsPage = new NewArrivalsPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    SalePage salePage = new SalePage();
    BestSellersPage bestSellersPage = new BestSellersPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker () throws InterruptedException{
        homePage.clickOnSaleSubPage();

        salePage.verifyUserIsOnSalePage();
        salePage.clickOnSortByAToZAndVerify();
        salePage.clickOnAddToCartButton();
        salePage.verifyProductHasBeenAddedToCartMessage();
        salePage.goToCartFromSalePage();

        shoppingCartPage.verifyShoppingCartHeaderMessage();
        shoppingCartPage.changeQuantityAndVerifyHeaderMessage("2");
        shoppingCartPage.verifySubTotal("$29.98");
        shoppingCartPage.verifyTotalAmount("$36.00");
        shoppingCartPage.clickOnGoToCheckOutButton();

        loginPage.verifyUserIsOnLogInPage();
        loginPage.enterYourEmail();
        loginPage.clickOnContinueButton();

        checkOutPage.verifyUserIsOnCheckOutPage();
        checkOutPage.addShippingAddress();
        checkOutPage.createProfile();
        checkOutPage.clickOnLocalShipping();
        checkOutPage.clickOnCODPaymentMethod();
        checkOutPage.verifyTotalAmount("$37.03");
        checkOutPage.clickOnPlaceOrderButton();
        checkOutPage.verifySuccessFullOrderMessage();


    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException{

        homePage.clickOnBestSellersSubPage();

        bestSellersPage.verifyUserIsOnBestSellersPage();
        bestSellersPage.clickOnSortByAtoZAndVerifyBestSellers();
        bestSellersPage.clickOnAddToCartButton();
        bestSellersPage.verifyProductHasBeenAddedToCartMessage();
        bestSellersPage.goToCartFromBestSellersPage();

        shoppingCartPage.verifyShoppingCartHeaderMessage();
        shoppingCartPage.clickOnEmptyYourCart();
        shoppingCartPage.verifyAlertMessageAndAccept();
        shoppingCartPage.verifyItemDeletedFromYourCartMessage();
        shoppingCartPage.verifyYourCarIsEmptyMessage();


    }
}

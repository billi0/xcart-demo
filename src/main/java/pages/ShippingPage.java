package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ShippingPage extends Utility {
    By shippingPageText = By.xpath("//h1[@id='page-title']");

    public void verifyUserIsOnShippingPage(){

        useVerifyResult("Shipping",shippingPageText,"wrong page");
    }

}

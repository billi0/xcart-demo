package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ContactUsPage extends Utility {
    By contactUsText = By.xpath("//h1[text()='Contact us']");

    public void verifyUserIsOnContactUsPage(){
        useVerifyResult("Contact us",contactUsText,"wrong page");
    }
}

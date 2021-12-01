package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class NewArrivalsPage extends Utility {

    By newArrivalsText = By.xpath("(//h1[normalize-space()='New arrivals'])[1]");

    public void verifyUserIsOnNewArrivalsPage(){
        useVerifyResult("New arrivals",newArrivalsText,"wrong page");
    }

}

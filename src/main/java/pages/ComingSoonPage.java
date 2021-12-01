package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ComingSoonPage extends Utility {
    By comingSoonText = By.xpath("(//h1[normalize-space()='Coming soon'])[1]");

    public void verifyUserIsOnComingSoonPage(){
        useVerifyResult("Coming soon",comingSoonText,"wrong page");
    }
}

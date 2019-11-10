package google;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigatetoGmailPage extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    public void userISOnGmailPage (){
        assertUrl("GB/gmail/about/#");
        //Assert
       // String expectgetMessage = "Gmail";
       // String actualMessage = getText(By.xpath("//div[@id=\"headingSubtext\"]"));
       // Assert.assertEquals(actualMessage, expectgetMessage);
    }
}

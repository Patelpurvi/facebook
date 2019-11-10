package google;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.xml.soap.Text;

public class NavigateToHomePage extends Utils {

LoadProperties loadProperties = new LoadProperties();

    public void userIsOnGoogleHomePage(){

        //Assert
        String expectgetMessage = "United Kingdom";
        String actualMessage = getText(By.xpath("//span[@class=\"Q8LRLc\"]"));
        Assert.assertEquals(actualMessage, expectgetMessage);
    }


}

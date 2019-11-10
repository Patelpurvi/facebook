package google;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MissSpellWord extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    public void userGetCorrectSpelling () {

        //Assert
        String ExpectedResult = "Showing results for";
        String AcctualResult = getText(By.xpath("//div/p/span[@class=\"gL9Hy\"]"));
        Assert.assertEquals( AcctualResult,ExpectedResult);

    }
}
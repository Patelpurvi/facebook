package google;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static google.Utils.getScreenshot;

public class Hooks extends Utils
{
    LoadProperties loadProperties = new LoadProperties();

        BrowserSelector browserSelector = new BrowserSelector();
        //static String timeStamp = new SimpleDataformate ("dd.MM.yy.HH.mm.ss").format(newDate());

        @BeforeMethod
        public void setUpBrowser(){
            browserSelector.setUpBrowser();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://www.google.co.uk/");
        }

        @AfterMethod
        public void closeBrowser()
        { getScreenshot();
            driver.quit();
        }


    }

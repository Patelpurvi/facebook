package google;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    LoadProperties loadProperties = new LoadProperties();

   // private By _logo = By.xpath("//div[@id=\"hplogo\"]");
    private By _gmail = By.xpath("//a[@data-pid=\"23\"]");
    private By _image = By.xpath("//a[@href=\"https://www.google.co.uk/imghp?hl=en&tab=wi&ogbl\"]");
    private By _gogglesearch = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
    private By _search = By.xpath("//input[@title=\"Search\"]");


//public void clickOnLogo (){clickElement(_logo);}
public void clickOnGmail(){ clickElement(_gmail); } //click on gmail
public void clickOnImage(){clickElement(_image);} // click on image
public void clickOnSearch (){clickElement(_gogglesearch);} //click on google search
public void userSearchTheWebsite (){
    enterText(_search,loadProperties.getProperty("search")); //enter the serching website name
}
public void userSearchWebsiteWithMissspelleWord (){
    enterText(_search,loadProperties.getProperty("missspeell"));
}



}

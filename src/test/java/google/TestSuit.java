package google;

import org.testng.annotations.Test;

public class TestSuit extends Hooks
{
    NavigateToHomePage navigateToHomePage = new NavigateToHomePage();
    HomePage homePage = new HomePage();
    NavigatetoGmailPage navigatetoGmailPage = new NavigatetoGmailPage();
    FacebookAssert facebookAssert = new FacebookAssert();
    MissSpellWord missSpellWord = new MissSpellWord();

    @Test
    public void usershouldabletoNavigateToGmailPageSuccessfully(){
     //   homePage.clickOnLogo();
    navigateToHomePage.userIsOnGoogleHomePage();
    homePage.clickOnGmail();
    navigatetoGmailPage.userISOnGmailPage(); }
    @Test
    public void userShouldAbleToNavigatToFacebookPageSuceessfully(){
        navigateToHomePage.userIsOnGoogleHomePage();
        homePage.userSearchTheWebsite();
        homePage.clickOnSearch();
        facebookAssert.userIsOnFacbookResultPage();}
     @Test
     public void userShouldprovidedCorrectWordSuggetionAndResultwithFacebook(){
         navigateToHomePage.userIsOnGoogleHomePage();
         homePage.userSearchWebsiteWithMissspelleWord();
         homePage.clickOnSearch();
         missSpellWord.userGetCorrectSpelling();


        }
    }



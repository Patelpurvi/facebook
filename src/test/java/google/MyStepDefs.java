package google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs  {


    NavigateToHomePage navigateToHomePage = new NavigateToHomePage();
    HomePage homePage = new HomePage();
    NavigatetoGmailPage navigatetoGmailPage = new NavigatetoGmailPage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
     navigateToHomePage.userIsOnGoogleHomePage();
    }
    @When("^User click on gmail button$")
    public void user_click_on_gmail_button()  {
    homePage.clickOnGmail();
    }
    @Then("^User should able to see gmail page for register account$")
    public void user_should_able_to_see_gmail_page_for_register_account()  {
    navigatetoGmailPage.userISOnGmailPage();

    }

}

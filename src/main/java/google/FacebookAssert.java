package google;

public class FacebookAssert extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    public void userIsOnFacbookResultPage (){
        assertUrl("facebook&oq"); }

}

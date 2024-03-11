package stepdefination;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.ResultsPage;

public class AmazonSteps {

    @Given("user search the product")
    public void search() throws InterruptedException {

        HomePage.enterProductName("iphone");
        HomePage.clickSearchIcon();
        Assert.assertEquals("Amazon.in : iphone", ResultsPage.getPageTitle());

    }
}

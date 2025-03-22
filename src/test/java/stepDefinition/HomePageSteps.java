package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.TestBase;

public class HomePageSteps {
    private final HomePage homePage;

    // Constructor initializes HomePage with WebDriver instance
    public HomePageSteps(TestBase testBase) {
        // Initialize HomePage with WebDriver from TestBase
        homePage = new HomePage(testBase.initializeDriver());
    }

    // Step to open the home page of W3Schools
    @Given("the home page is accessed")
    public void accessHomePage() {
        homePage.openHomePage();  // Open the W3Schools homepage
    }

    // Step to skip sign-in (if applicable)
    @When("the skip sign in button is clicked")
    public void skipSignIn() {
        homePage.clickSkipSignIn();  // Click the skip sign-in button (optional step)
    }
}

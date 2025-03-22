package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import utils.TestBase;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertTrue;
import static utils.TestBase.driver;

public class W3LoginSteps {
    private final HomePage homePage;
    private LoginPage loginPage;

    // Constructor initializes HomePage and WebDriver
    public W3LoginSteps(TestBase testBase) {
        homePage = new HomePage(testBase.initializeDriver());
    }

    // Step to click on the login button
    @When("the login button is clicked")
    public void clickLoginButton() {
        WebDriver driver = homePage.getDriver();  // Get the driver from homePage
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));  // Set up WebDriverWait
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']")));  // Replace with actual locator
        loginButton.click();
    }

    // Step to verify if the login page is displayed
    @Then("the login page should be displayed")
    public void verifyLoginPage() {
        loginPage = new LoginPage(homePage.getDriver());
        assertTrue("Login page is not displayed", loginPage.isLoginPageDisplayed());
    }

    // Step to enter valid login credentials and submit
    @When("invalid login credentials are provided")
    public void enterValidCredentials() throws InterruptedException {
        loginPage.login("your_email", "your_password");  // Provide valid credentials
    sleep(3000);
    }

    // Step to verify if the user is logged in successfully (Example: check for user profile)
    @Then("the user should not be logged in")
    public void verifyLoginSuccess() {
        // Example: Check if a logout button or username appears, indicating a successful login
        boolean isUserLoggedIn = homePage.getDriver().findElement(By.className("LoginForm_error_text__4fzmN")).isDisplayed();
          assertTrue("User is not logged in", isUserLoggedIn);
    }
}

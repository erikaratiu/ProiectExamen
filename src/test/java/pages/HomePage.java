package pages;

import constants.MyConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;

    // Constructor that initializes WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to open the home page of W3Schools
    public void openHomePage() {
        driver.get(MyConstants.homePage);  // Open the W3Schools homepage
    }

    // Method to click the login button
    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.id("loginButton")); // Replace with actual element locator
        loginButton.click();

        // Click the login button once it becomes visible and clickable
        loginButton.click();
    }

    // Method to get the WebDriver instance
    public WebDriver getDriver() {
        return driver;
    }

    public void clickSkipSignIn() {
    }

}

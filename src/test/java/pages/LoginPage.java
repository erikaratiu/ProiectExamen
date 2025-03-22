package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {private WebDriver driver;

    // Constructor that initializes WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify if the login page is displayed
    public boolean isLoginPageDisplayed() {
        // Example: Check if the login form is visible by checking for a specific element
        return driver.findElement(By.className("LoginPanel_login_signup__N4spj")).isDisplayed();  // Assuming ID "username" for the username input field
    }

    // Method to log in with valid credentials
    public void login(String username, String password) {
        driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys(username);  // Fill in the username
        driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys(password);  // Fill in the password
        driver.findElement(By.cssSelector("button[type='submit']")).click();             // Click the login button
    }
}

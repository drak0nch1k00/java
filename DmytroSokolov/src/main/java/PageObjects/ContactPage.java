package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
    WebDriver driver;

    By subjectDropdown = By.name("subject");
    By emailField = By.name("email");
    By attachmentField = By.name("attachment");
    By messageField = By.name("message");
    By submitButton = By.name("submit");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactForm(String subject, String email, String attachmentPath, String message) {
        driver.findElement(subjectDropdown).sendKeys(subject);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(attachmentField).sendKeys(attachmentPath);
        driver.findElement(messageField).sendKeys(message);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(By.cssSelector(".success-message"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".error-message"));
    }
}

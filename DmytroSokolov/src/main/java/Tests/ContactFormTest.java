package Tests;

import PageObjects.ContactPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ContactFormTest {

    @Test
    public void testContactFormSuccess() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/contact");

        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactForm("Support", "test@example.com", "path/to/file", "This is a test message.");
        contactPage.submitForm();

        assertTrue(contactPage.getSuccessMessage().isDisplayed());

        driver.quit();
    }

    @Test
    public void testContactFormError() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/contact");

        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactForm("Support", "test@example.com", "path/to/file", "");
        contactPage.submitForm();

        assertTrue(contactPage.getErrorMessage().isDisplayed());

        driver.quit();
    }
}

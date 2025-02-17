package Tests;

import PageObjects.ShoppingCartPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void testAddToCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.litecart.net");

        ShoppingCartPage cartPage = new ShoppingCartPage(driver);
        cartPage.openCart();

        assertTrue(cartPage.getCartItemCount() > 0);
        driver.quit();
    }

    @Test
    public void testRemoveFromCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.litecart.net");

        ShoppingCartPage cartPage = new ShoppingCartPage(driver);
        cartPage.openCart();

        int initialItemCount = cartPage.getCartItemCount();
        cartPage.removeProduct(0);

        assertEquals(initialItemCount - 1, cartPage.getCartItemCount());

        driver.quit();
    }
}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    WebDriver driver;

    By cartIcon = By.cssSelector(".cart-icon");
    By cartItems = By.cssSelector(".cart-items");
    By totalPrice = By.cssSelector(".total-price");
    By removeButtons = By.cssSelector(".remove-item");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public int getCartItemCount() {
        return driver.findElements(cartItems).size();
    }

    public String getTotalPrice() {
        return driver.findElement(totalPrice).getText();
    }

    public void removeProduct(int index) {
        driver.findElements(removeButtons).get(index).click();
    }
}

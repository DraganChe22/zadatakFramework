package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AddToCart extends BasePage{

    public By addToCardButton = By.xpath("//button[@data-id=\"42930\"]");



    public AddToCart(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }



    public void addToCartAction (){
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCardButton));
        button.click();
    }



















}

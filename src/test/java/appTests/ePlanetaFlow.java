package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddToCart;
import pages.SearchProduct;
import pages.SelectProduct;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ePlanetaFlow extends BaseTest {

    SearchProduct searchProduct = new SearchProduct(driver, Duration.ofSeconds(10));

    SelectProduct selectProduct = new SelectProduct(driver, Duration.ofSeconds(10));

    AddToCart addToCart = new AddToCart(driver, Duration.ofSeconds(10));





    @Test
    public void flow() throws InterruptedException {
        searchProduct.searchAction();
        selectProduct.clickOnProduct();
        Thread.sleep(10000);
        addToCart.addToCartAction();
        Thread.sleep(10000);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Proizvod je dodat u korpu')]")));
//
//        String expectedText = "Proizvod je dodat u korpu";
//        String actualText = modal.getText();
//        Assert.assertTrue("Tekst nije pronađen u modalu: " + actualText, actualText.contains(expectedText));
//        Assert.assertTrue(driver.findElement(By.xpath("//button[@title=\"Dodato u korpu\"]")).getText().contains("Dodato u korpu"));

        WebElement confirmation = driver.findElement(By.xpath("//*[contains(text(),'Dodato u korpu')]"));
        assertTrue(confirmation.isDisplayed());

//        WebElement cartCounter = driver.findElement(By.cssSelector(".mini-cart-count"));
//        assertEquals("1", cartCounter.getText());

//        WebElement cartCounter = driver.findElement(By.className("counter-number"));
//        Assert.assertTrue(cartCounter.getText().contains("1"));
        
//        WebElement confirmation = driver.findElement(By.xpath("//*[contains(text(),'Ukupno (sa porezom)')]"));
//        assertTrue(confirmation.isDisplayed());

//        WebElement confirmation = driver.findElement(By.xpath("//*[contains(text(),'1 artikal u korpi')]"));
//        assertTrue(confirmation.isDisplayed());

    }






}

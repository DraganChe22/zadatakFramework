package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SearchProduct extends BasePage {


    public By searchInputField = By.id("search");

    public By searchButton = By.xpath("//button[@class=\"action search\"]");


    public SearchProduct(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }


    public void searchAction () {
        driver.findElement(searchInputField).sendKeys("Aparat za galete");
//        driver.findElement(searchButton).click();
        click(searchButton);

    }
























}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SelectProduct extends BasePage {

    public By productWaffleName = By.xpath("//*[text()=\"VOX Aparat za galete WF 2081 M - 42930\"]");




    public SelectProduct(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void clickOnProduct (){
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(productWaffleName));
        button.click();
    }












}

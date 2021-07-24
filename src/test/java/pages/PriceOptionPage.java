package pages;

import maps.PriceOptionMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionPage {
    private WebDriver driver;
    private PriceOptionMap priceOptionMap;

    public PriceOptionPage(WebDriver driver) {
        this.driver = driver;
        priceOptionMap = new PriceOptionMap();
        PageFactory.initElements(driver, priceOptionMap);
    }

    public String getTitlePriceOption() {
        return priceOptionMap.txtPriceOption.getText();
    }

    public void priceOption() {
        priceOptionMap.txtPriceOption1.click();
    }

    public void nextSendQuote() {
        WebDriverWait waitSendQuote = new WebDriverWait(driver,5);
        waitSendQuote.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/button[2]")));
        priceOptionMap.btnNextSendQuote.click();
    }

}

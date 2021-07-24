package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceOptionMap {

    @FindBy(xpath = "//*[@id='selectpriceoption']")
    public WebElement txtPriceOption;

    @FindBy(xpath = "//*[@id='priceTable']//label[2]")
    public WebElement txtPriceOption1;

    @FindBy(xpath = "//div[2]/button[2]")
    public WebElement btnNextSendQuote;
}

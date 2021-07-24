package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDataMap {

    @FindBy(xpath = "//*[@id='enterproductdata']")
    public WebElement txtProductData;

    @FindBy(xpath = "//*[@id='startdate']")
    public WebElement txtStartDate;

    @FindBy(xpath = "//div[5]//label[1]/span")
    public WebElement txtOptionalProduct1;

    @FindBy(xpath = "//*[@id='nextselectpriceoption']")
    public WebElement btnNextSelectPriceOption;
}

package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class InsuranceDataMap {

    @FindBy(xpath = "//*[@id='enterinsurantdata']")
    public WebElement txtInsurantData;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement txtFirstName;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement txtLastName;

    @FindBy(xpath = "//*[@id='birthdate']")
    public WebElement txtDateOfBirth;

    @FindBy(xpath = "//div[4]/p/label[1]/span")
    public WebElement txtGender;

    @FindBy(xpath = "//*[@id='streetaddress']")
    public WebElement txtStreetAddress;

    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement txtZipCode;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement txtCity;

    @FindBy(xpath = "//div[10]//label[2]/span")
    public WebElement txthobbie1;

    @FindBy(xpath = "//div[10]//label[4]/span")
    public WebElement txthobbie2;

    @FindBy(xpath = "//*[@id='nextenterproductdata']")
    public WebElement btnNextEnterProductData;
}

package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDataMap {
    @FindBy(xpath = "//*[@id='entervehicledata']")
    public WebElement txtVehicleData;

    @FindBy(xpath = "//*[@id='cylindercapacity']")
    public WebElement txtCylinderCapacity;

    @FindBy(xpath = "//*[@id='engineperformance']")
    public WebElement txtEnginePerformance;

    @FindBy(xpath = "//*[@id='dateofmanufacture']")
    public WebElement txtDateOfManufacture;

    @FindBy(xpath = "//div[7]/p/label[1]/span")
    public WebElement txtrightHandDrive1;

    @FindBy(xpath = "//*[@id='payload']")
    public WebElement txtPayload;

    @FindBy(xpath = "//*[@id='totalweight']")
    public WebElement txtTotalWeight;

    @FindBy(xpath = "//*[@id='listprice']")
    public WebElement txtListPrice;

    @FindBy(xpath = "//*[@id='licenseplatenumber']")
    public WebElement txtLicensePlateNumber;

    @FindBy(xpath = "//*[@id='annualmileage']")
    public WebElement txtAnnualMileage;

    @FindBy(xpath = "//*[@id='nextenterinsurantdata']")
    public WebElement btnNextEnterInsurantData;



}

package pages;

import maps.ProductDataMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage {
    private WebDriver driver;
    private ProductDataMap productDataMap;

    public ProductDataPage(WebDriver driver) {
        this.driver = driver;
        productDataMap = new ProductDataMap();
        PageFactory.initElements(driver, productDataMap);
    }

    public String getTitleProductData() {
        return productDataMap.txtProductData.getText();
    }

    public void startDate() {
        productDataMap.txtStartDate.click();
        productDataMap.txtStartDate.sendKeys("08/26/2021");
    }

    public void insuranceSum() {
        Select insuranceSum = new Select(driver.findElement(By.id("insurancesum")));
        insuranceSum.selectByVisibleText("7.000.000,00");
    }

    public void meritRating() {
        Select meritRating = new Select(driver.findElement(By.id("meritrating")));
        meritRating.selectByVisibleText("Malus 10");
    }

    public void damageInsurance() {
        Select damageInsurance = new Select(driver.findElement(By.id("damageinsurance")));
        damageInsurance.selectByVisibleText("Full Coverage");
    }

    public void optionalProducts() {
        productDataMap.txtOptionalProduct1.click();
    }

    public void courtesyCar() {
        Select courtesyCar = new Select(driver.findElement(By.id("courtesycar")));
        courtesyCar.selectByVisibleText("Yes");
    }

    public void nextSelectPriceOption() {
        productDataMap.btnNextSelectPriceOption.click();
    }

}

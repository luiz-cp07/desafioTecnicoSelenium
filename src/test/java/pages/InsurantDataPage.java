package pages;

import maps.InsuranceDataMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage {
    private WebDriver driver;
    private InsuranceDataMap insuranceDataMap;

    public InsurantDataPage(WebDriver driver) {
        this.driver = driver;
        insuranceDataMap = new InsuranceDataMap();
        PageFactory.initElements(driver, insuranceDataMap);
    }

    public String getTitleInsurant() {
        return insuranceDataMap.txtInsurantData.getText();
    }

    public void firstName() {
        insuranceDataMap.txtFirstName.sendKeys("Luiz");
    }

    public void lastName() {
        insuranceDataMap.txtLastName.sendKeys("Teste");
    }

    public void dateOfBirth() {
        insuranceDataMap.txtDateOfBirth.click();
        insuranceDataMap.txtDateOfBirth.sendKeys("01/10/1990");
    }

    public void gender() {
        insuranceDataMap.txtGender.click();
    }

    public void streetAddress() {
        insuranceDataMap.txtStreetAddress.sendKeys("Rua Teste");
    }

    public void country() {
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Brazil");
    }

    public void zipCode() {
        insuranceDataMap.txtZipCode.sendKeys("300256");
    }

    public void city() {
        insuranceDataMap.txtCity.sendKeys("Uberlandia");
    }

    public void occupation() {
        Select occupation = new Select(driver.findElement(By.id("occupation")));
        occupation.selectByVisibleText("Farmer");
    }

    public void hobbies() {
        insuranceDataMap.txthobbie1.click();
        insuranceDataMap.txthobbie2.click();
    }

    public void nextEnterProductData() {
        insuranceDataMap.btnNextEnterProductData.click();
    }
}

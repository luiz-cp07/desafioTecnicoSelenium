package pages;

import maps.VehicleDataMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage {
        private WebDriver driver;
        private VehicleDataPage vehicleDataPage;
        private VehicleDataMap vehicleDataMap;


        public VehicleDataPage(WebDriver driver) {

            this.driver = driver;
            vehicleDataMap = new VehicleDataMap();
            PageFactory.initElements(driver, vehicleDataMap);
        }

        public String getTitleVehicleData() {
            return vehicleDataMap.txtVehicleData.getText();
        }

        public void getMake() {
            Select make = new Select(driver.findElement(By.id("make")));
            make.selectByVisibleText("Audi");
        }

        public void getModel() {
            Select model = new Select(driver.findElement(By.id("model")));
            model.selectByVisibleText("Moped");
        }

        public void cylinderCapacity() {
            vehicleDataMap.txtCylinderCapacity.sendKeys("200");
        }

        public void enginePerformance() {
            vehicleDataMap.txtEnginePerformance.sendKeys("200");
        }

        public void dateOfManufacture() {
            vehicleDataMap.txtDateOfManufacture.click();
            vehicleDataMap.txtDateOfManufacture.sendKeys("12/01/2010");
        }

        public void numberOfSeats() {
            Select numberOfSeats = new Select(driver.findElement(By.id("numberofseats")));
            numberOfSeats.selectByVisibleText("5");
        }

        public void rightHandDrive1() {
            vehicleDataMap.txtrightHandDrive1.click();
        }

        public void numberOfSeatsMotorcycle() {
            Select numberOfSeatsMotorcycle = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
            numberOfSeatsMotorcycle.selectByVisibleText("2");
        }

        public void fuel() {
            Select fuel = new Select(driver.findElement(By.id("fuel")));
            fuel.selectByVisibleText("Electric Power");
        }

        public void payload() {
            vehicleDataMap.txtPayload.sendKeys("400");
        }

        public void totalWeight() {
            vehicleDataMap.txtTotalWeight.sendKeys("2500");
        }

        public void listPrice() {
            vehicleDataMap.txtListPrice.sendKeys("33000");
        }

        public void licensePlateNumber() {
            vehicleDataMap.txtLicensePlateNumber.sendKeys("1001");
        }

        public void annualMileage() {
            vehicleDataMap.txtAnnualMileage.sendKeys("3999");
        }

        public void nextEnterInsurantData() {
            vehicleDataMap.btnNextEnterInsurantData.click();
        }
    }

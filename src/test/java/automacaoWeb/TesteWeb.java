package automacaoWeb;

import core.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;
    VehicleDataPage vehicleDataPage;
    InsurantDataPage insurantDataPage;
    ProductDataPage productDataPage;
    PriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;

    @Before
    public void inicializaTest(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.driver;
        driver.get("http://sampleapp.tricentis.com/101/app.php");

        vehicleDataPage = new VehicleDataPage(driver);
        insurantDataPage = new InsurantDataPage(driver);
        productDataPage = new ProductDataPage(driver);
        priceOptionPage = new PriceOptionPage(driver);
        sendQuotePage = new SendQuotePage(driver);
    }

    @Test
    public void vehicleInsuranceTest() {

        String titleVehicleData = vehicleDataPage.getTitleVehicleData();
        assertEquals("Enter Vehicle Data\n" + "12", titleVehicleData);

        vehicleDataPage.getMake();
        vehicleDataPage.getModel();
        vehicleDataPage.cylinderCapacity();
        vehicleDataPage.enginePerformance();
        vehicleDataPage.dateOfManufacture();
        vehicleDataPage.numberOfSeats();
        vehicleDataPage.rightHandDrive1();
        vehicleDataPage.numberOfSeatsMotorcycle();
        vehicleDataPage.fuel();
        vehicleDataPage.payload();
        vehicleDataPage.totalWeight();
        vehicleDataPage.listPrice();
        vehicleDataPage.licensePlateNumber();
        vehicleDataPage.annualMileage();
        vehicleDataPage.nextEnterInsurantData();

        String titleInsurant = insurantDataPage.getTitleInsurant();
        assertEquals("Enter Insurant Data\n" + "7", titleInsurant);
        insurantDataPage.firstName();
        insurantDataPage.lastName();
        insurantDataPage.dateOfBirth();
        insurantDataPage.gender();
        insurantDataPage.streetAddress();
        insurantDataPage.country();
        insurantDataPage.zipCode();
        insurantDataPage.city();
        insurantDataPage.occupation();
        insurantDataPage.hobbies();
        insurantDataPage.nextEnterProductData();

        String titleProductData = productDataPage.getTitleProductData();
        assertEquals("Enter Product Data\n" + "6", titleProductData);
        productDataPage.startDate();
        productDataPage.insuranceSum();
        productDataPage.meritRating();
        productDataPage.damageInsurance();
        productDataPage.optionalProducts();
        productDataPage.courtesyCar();
        productDataPage.nextSelectPriceOption();

        String titlePriceOption = priceOptionPage.getTitlePriceOption();
        assertEquals("Select Price Option\n" + "1", titlePriceOption);
        priceOptionPage.priceOption();
        priceOptionPage.nextSendQuote();

        String titleSendQuote = sendQuotePage.getTitleSendQuote();
        assertEquals("Send Quote\n" + "4", titleSendQuote);
        sendQuotePage.email();
        sendQuotePage.phone();
        sendQuotePage.username();
        sendQuotePage.password();
        sendQuotePage.confirmPassword();
        sendQuotePage.sendEmail();

        String msgSuccess = sendQuotePage.getMsgSuccess();
        assertEquals("Sending e-mail success!\n" + "OK" , msgSuccess);
    }
}

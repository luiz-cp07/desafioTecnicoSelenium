package pages;

import maps.SendQuoteMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuotePage {
    private WebDriver driver;
    private SendQuoteMap sendQuoteMap;

    public SendQuotePage(WebDriver driver)
    {
        this.driver = driver;
        sendQuoteMap = new SendQuoteMap();
        PageFactory.initElements(driver, sendQuoteMap);
    }

    public String getTitleSendQuote() {
        String titleSendQuote = sendQuoteMap.txtSendQuote.getText();
        return titleSendQuote;
    }

    public void email() {
        sendQuoteMap.txtEmail.sendKeys("testeqa@teste.com");
    }

    public void phone() {
        sendQuoteMap.txtPhone.sendKeys("1199998888");
    }

    public void username() {
        sendQuoteMap.txtUsername.sendKeys("teste01");
    }

    public void password() {
        sendQuoteMap.txtPassword.sendKeys("Teste@teste01");
    }

    public void confirmPassword() {
        sendQuoteMap.txtConfirmPassword.sendKeys("Teste@teste01");
    }

    public void sendEmail() {
        sendQuoteMap.btnSendEmail.click();
    }

    public String getMsgSuccess() {
        WebDriverWait waitMessage = new WebDriverWait(driver,30);
        waitMessage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));
        String msgSuccess = sendQuoteMap.txtMsgSuccess.getText();
        return msgSuccess;
    }
}

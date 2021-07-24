package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendQuoteMap {

    @FindBy(xpath = "//*[@id='sendquote']")
    public WebElement txtSendQuote;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement txtEmail;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement txtPhone;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement txtUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id='confirmpassword']")
    public WebElement txtConfirmPassword;

    @FindBy(xpath = "//*[@id='sendemail']")
    public WebElement btnSendEmail;

    @FindBy(xpath = "/html/body/div[4]")
    public WebElement txtMsgSuccess;

}

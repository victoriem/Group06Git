package vyTrackProject.pages;

import vyTrackProject.utilities.BrowserUtils;
import vyTrackProject.utilities.ConfigurationReader;

import vyTrackProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class vyTrackLoginPage {

    public vyTrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Login label
    @FindBy(className = "title")
    public WebElement loginLabel;

    //username
    @FindBy(id = "prependedInput")
    public WebElement userNameInput;

    //password
    @FindBy(css = "input[id='prependedInput2']")
    public WebElement passwordInput;

    //login button
    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginButton;

    //remember me text
    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeText;

    public void gotoLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
    }

    public void login(String userName,String password){
        gotoLoginPage();
        userNameInput.sendKeys(userName);
        BrowserUtils.sleep(2);
        passwordInput.sendKeys(password);
        BrowserUtils.sleep(2);
        loginButton.click();
    }
}

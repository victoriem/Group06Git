package vyTrackProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogin {

    @FindBy(css = ".login-inp")
    public WebElement logIn;

    @FindBy(css = ".login-inp")
    public WebElement password;

    @FindBy(css = "input[value='Log In']")
    public WebElement logInButton;

}

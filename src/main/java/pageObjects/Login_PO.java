package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO {

    private @FindBy(id = "text")  // finds the username textfield by using the id
    WebElement username_TextField;

    private @FindBy(id = "password") // finds the password textfield by using the id
    WebElement password_TextField;

    private @FindBy(id = "login-button") // finds the login button by using the id
    WebElement login_Button;

    public Login_PO() {
        super(); // super points to the constructor of the Base_PO
    }

    public void navigateTo_WebdriverUniversity_LoginPage() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html?");
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);  // uses sendKeys() method in the Base page Base_PO
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password); // uses sendKeys() method in the Base page Base_PO
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation failed");
    }


}

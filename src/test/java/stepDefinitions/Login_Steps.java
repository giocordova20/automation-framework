package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps  extends Base_PO {
//    private WebDriver driver;
//
//    @Before("@login")
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver.drivers/chromedriver");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//    }
//
//    @After("@login")
//    public void tearDown() {
//        driver.quit();
//    }

//    private WebDriver driver = getDriver();  // No longer needed as it is handled in the Base page

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){  // Login page object
        this.login_po = login_po;
    }


    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
//        navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?"); // moved to LoginPO
        login_po.navigateTo_WebdriverUniversity_LoginPage();
    }

    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
//        driver.findElement(By.id("text")).sendKeys(username);
//        sendKeys(By.id("text"), username);
        login_po.setUsername(username);  // use the method in the Login_PO
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//        sendKeys(By.id("password"), password);
        login_po.setPassword(password);     // use the method in the Login_PO
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
//        driver.findElement(By.id("login-button")).click();
        login_po.clickOn_Login_Button();    // use the method in the Login_PO
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, "validation succeeded");
        login_po.validate_SuccessfulLogin_Message();
    }


    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, "validation failed");
        login_po.validate_UnsuccessfulLogin_Message();
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, expectedMessage);
        waitForAlert_And_ValidateText(expectedMessage);
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;


public class Contact_Us_Steps extends Base_PO {
//    private WebDriver driver;
//
//    @Before("@contact-us")
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver.drivers/chromedriver");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//    }
//
//    @After("@contact-us")
//    public void tearDown() {
//        driver.quit();
//    }
//    private WebDriver driver = getDriver();

//    ***MOVED TO Base_PO***
//    public String generateRandomNumber(int length) {
//        return RandomStringUtils.randomNumeric(length);
//    }
//    public String generateRandomString(int length) {
//        return RandomStringUtils.randomAlphabetic(length);
//    }

    private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps (Contact_Us_PO contact_us_po) {     // Contact Us page object
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
//        navigateTo_URL("https://webdriveruniversity.com/Contact-Us/contactus.html");
          contact_us_po.navigate_To_WebdriverUniversity_ContactUs_Page();// method from the ContactUS page object
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
//        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN" + generateRandomNumber(5));
//        sendKeys(By.xpath("//input[@name='first_name']"), "AutoFN" + generateRandomNumber(5));  // method is in Base_PO
        contact_us_po.setUnique_FirstName();    // method is in Contact Us page object
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
//        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("AutoLN" + generateRandomNumber(5));
//        sendKeys(By.xpath("//input[@name='last_name']"), "AutoLN" + generateRandomNumber(5));   // method is in Base_PO
        contact_us_po.setUnique_LastName();    // method is in Contact Us page object
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("AutoEmail" + generateRandomNumber(10)+"@mail.com");
//        sendKeys(By.xpath("//input[@name='email']"), "AutoEmail" + generateRandomNumber(10)+"@mail.com");   // method is in Base_PO
        contact_us_po.setUnique_EmailAddress(); // method is in Contact Us page object
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
//        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("AutoEmail" + generateRandomString(20));
//        sendKeys(By.xpath("//textarea[@name='message']"), "Hello World " + generateRandomString(20));   // method is in Base_PO
        contact_us_po.setUnique_Comment();  // method is in the Contact Us page object
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
//        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();   // method is in Base_PO
        contact_us_po.clickOn_Submit_Button();  // method is in Contact_Us_PO
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
//        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
//        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
        contact_us_po.validate_Successful_SubmissionMessage_Text();         // method is in Contact_Us_PO
    }


    @And("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {
//        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
//        sendKeys(By.xpath("//input[@name='first_name']"), firstName);   // method in Base_PO
        contact_us_po.setSpecific_FirstName(firstName);     // method is in Contact_Us_PO
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
//        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
//        sendKeys(By.xpath("//input[@name='last_name']"), lastName);     // method is in Base_PO
        contact_us_po.setSpecific_LastName(lastName);       // method is in Contact_Us_PO
    }

    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blogss123_mail_com(String email) {
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//        sendKeys(By.xpath("//input[@name='email']"), email);    // method is in Base_PO
        contact_us_po.setSpecific_EmailAddress(email);   // method in Contact_Us_PO
    }

    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
//        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(comment);
//        sendKeys(By.xpath("//textarea[@name='message']"), comment);     // method is in Base_PO
        contact_us_po.setSpecific_Comment(comment);     // method in Contact_Us_PO
    }



}

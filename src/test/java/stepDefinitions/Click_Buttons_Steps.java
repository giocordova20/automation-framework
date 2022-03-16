package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Click_Buttons_PO;

public class Click_Buttons_Steps extends Base_PO {
//    private WebDriver driver;

    private Click_Buttons_PO click_buttons_po;

    public Click_Buttons_Steps(Click_Buttons_PO click_buttons_po) {
        this.click_buttons_po = click_buttons_po;
    }


    @Given("I access the buttons page")
    public void i_access_the_buttons_page() throws InterruptedException {
        click_buttons_po.navigateTo_Click_Butons_Page();
    }

    @When("I click on the button by {}")
    public void i_click_on(String button) {
        System.out.println("\nThe Button being clicked is " + button);
        click_buttons_po.clickMe_button(button);
    }

    @Then("The validation message appears {} {}")
    public void the_validation_message_appears(String button, String expectedMessage) {
        click_buttons_po.validate_Successful_ClickMessage_Text(button, expectedMessage);
    }
}

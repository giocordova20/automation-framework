package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Click_Buttons_PO extends Base_PO{

    private @FindBy(xpath ="//*[@id='button1']" ) // Button 1
    WebElement clickMeButton_xpath;

    private @FindBy(css = "#button2")
    WebElement clickMeButton_css;

    private @FindBy(id = "button3")
    WebElement clickMeButton_id;

    private @FindBy(xpath = "//*[@id='myModalClick']//h4")
    WebElement buttonXpathMessage;

    private @FindBy(css = "#myModalJSClic")
    WebElement buttonCSSMessage;

    private @FindBy(id = "myModalMoveClick")
    WebElement buttonIdMessage;


    public Click_Buttons_PO() {
        super();
    }

    public void navigateTo_Click_Butons_Page() throws InterruptedException {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Click-Buttons/index.html");
//        Thread.sleep(2000);
    }

    public void clickMe_button(String button){
        switch (button) {
            case "xpath" -> {
                waitForWebElementAndClick(clickMeButton_xpath);
                break;
            }
            case "css" -> {
                waitForWebElementAndClick(clickMeButton_css);
                break;
            }
            case "id" -> {
                waitForWebElementAndClick(clickMeButton_id);
                break;
            }
        }
    }

    public void validate_Successful_ClickMessage_Text(String button, String message) {

        switch (button)  {
            case "xpath" -> {
                waitFor(buttonXpathMessage);
                Assert.assertEquals(buttonXpathMessage.getText(), message);

                break;
        }
            case "css" -> {
                waitFor(buttonCSSMessage);
                Assert.assertEquals(buttonCSSMessage.getText(), message);

                break;
            }
            case "id" -> {
                waitFor(buttonIdMessage);
                Assert.assertEquals(buttonIdMessage.getText(), message);

                break;
            }
        }
    }
}

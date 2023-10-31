package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterResult extends BasePage{
    public RegisterResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css=".button-1.register-continue-button")
    WebElement continueButton;

    public void clickContinueButton(){
        clickElement(continueButton, "CLicked on continue button");
    }

}

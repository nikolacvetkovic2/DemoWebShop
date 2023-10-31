package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="gender-male")
    WebElement gender;
    @FindBy(id="FirstName")
    WebElement firstName;
    @FindBy(id="LastName")
    WebElement lastName;
    @FindBy(id="Email")
    WebElement email;
    @FindBy(id="Password")
    WebElement password;
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(css="[name=\"register-button\"]")
    WebElement registerButton;

    public void selectGender() {
        clickElement(gender, "Clicked Gender");
    }
    public void enterFirstName(){
        typeIn(firstName,"NIkola1","Entered first name");
    }
    public void enterLastName(){
        typeIn(lastName,"Cvetkovic1","Entered last name");
    }
    public void enterEmail(){
        typeIn(email,randomEmail(),"Entered email address");
    }

    public void enterPassword(){
        typeIn(password,"Lozinka1!","Entered password");
    }

    public void confirmPassword(){
        typeIn(confirmPassword,"Lozinka1!","Entered confirmed password");
    }

    public void registerAccount() {
        clickElement(registerButton, "Clicked register button");
    }

    public void login(){
        selectGender();
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPassword();
        confirmPassword();
        registerAccount();
    }

    }




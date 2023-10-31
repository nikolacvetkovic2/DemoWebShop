package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;

    public void clickRegisterButton() {
        clickElement(registerButton, "Clicked on Register button.");
    }

    public void clickElement(WebElement element, String log) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();

        System.out.println(log);
    }

    public void typeIn(WebElement element, String text, String log) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        element.clear();
        element.sendKeys(text);
        System.out.println(log);
    }

    public String randomEmail() {
        return System.currentTimeMillis() + "@gmail.com";
    }

    public String getText(WebElement element,WebElement element2, String log) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(element2).click().build().perform();

        System.out.println("Getting text from: " + log + "element");

        return element.getText();

    }

}

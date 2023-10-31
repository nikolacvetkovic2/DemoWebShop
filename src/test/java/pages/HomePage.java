package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".top-menu>:first-child>:first-child")
    WebElement books;
    @FindBy(css = ".product-grid>:first-child>:first-child>:last-child>:last-child>:last-child>input")
    WebElement firstBook;
    @FindBy(css = ".product-grid>:nth-child(5)>:first-child>:last-child>:last-child>:last-child>input")
    WebElement secondBook;
    @FindBy(css = ".header-menu>:first-child>:nth-child(2)>a")
    WebElement computers;
    @FindBy(css = ".center-2>:last-child>:last-child>div>:nth-child(2)>div>h2>a")
    WebElement notebooks;
    @FindBy(css = ".page-body>:nth-child(3)>div>div>:last-child>:last-child>:last-child>input")
    WebElement laptop;
    @FindBy(css = ".header-links-wrapper>div>ul>:nth-child(3)>a>:last-child")
    WebElement shoppingCart;
    String shoppingCartNumber=" .header-links-wrapper>div>ul>:nth-child(3)>a>:last-child";


    public void openBooks(){
        clickElement(books,"Clicked on BOOKS.");
    }

    public void addFistBook(){
        clickElement(firstBook,"Added the first book.");
    }
    public void addSecondBook(){
        clickElement(secondBook,"Added the second book.");
    }

    public void openComputers(){
        clickElement(computers,"Clicked on the COMPUTERS.");
    }

    public void openNotebooks(){
        clickElement(notebooks,"Clicked on the Notebooks.");
    }
    public void addLaptop(){
        clickElement(laptop,"Laptop added");
    }
    public void clickOnShoppingCart(){
        clickElement(shoppingCart,"Clicked on Shopping cart button");
    }

    public void addDevices(){
        openBooks();
        addFistBook();
        addSecondBook();
        openComputers();
        openNotebooks();
        addLaptop();
        clickOnShoppingCart();
    }
}

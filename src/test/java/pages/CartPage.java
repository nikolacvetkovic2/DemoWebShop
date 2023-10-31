package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    String productPrice1=".subtotal.nobr.end>:last-child";
    String productPrice2="/html[1]/body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[6]";
    String productPrice3=".order-summary-content>form>table>:last-child>:last-child>:last-child>:last-child";
    String Total=".cart-footer>:nth-child(2)>.total-info>table>tbody>:nth-child(4)>:last-child>:last-child>:last-child>:last-child";

    public double getProductPrice1(){
        return Double.parseDouble(driver.findElement(By.cssSelector(productPrice1)).getText());
    }
    public double getProductPrice2(){
        return Double.parseDouble(driver.findElement(By.xpath(productPrice2)).getText());
    }
    public double getProductPrice3(){
        return Double.parseDouble(driver.findElement(By.cssSelector(productPrice3)).getText());
    }
    public double getTotal(){
        return Double.parseDouble(driver.findElement(By.xpath((Total))).getText());
    }
    double sum=0;
    public double sum(){
        sum=getProductPrice1() + getProductPrice2()+ getProductPrice3();
        return sum;
    }


}

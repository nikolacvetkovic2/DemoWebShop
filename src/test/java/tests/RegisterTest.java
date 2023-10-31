package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterResult;

public class RegisterTest extends BaseTest {


    @BeforeMethod
    public void init(){
      startApplication();
    }

    @AfterMethod
    public void tearDown(){
        closeApplication();
    }

    @Test
    public void register(){
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.clickRegisterButton();
        registerPage.login();

        Assert.assertEquals(driver.findElement(By.cssSelector(".page-body>div")).getText(),"Your registration completed", "Something went wrong on registration result.");

        RegisterResult registerResult=new RegisterResult(driver);
        registerResult.clickContinueButton();

        HomePage homePage=new HomePage(driver);
        homePage.addDevices();

        CartPage cartPage=new CartPage(driver);
        System.out.println(cartPage.getProductPrice1());
        System.out.println(cartPage.getProductPrice2());
        System.out.println(cartPage.getProductPrice3());
        System.out.println(cartPage.sum());
        System.out.println(cartPage.getTotal());
    }

}

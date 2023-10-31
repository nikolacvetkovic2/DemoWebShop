package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver driver;

     protected void startApplication(){
         System.setProperty("driver.chrome.driver","src/main/resources/chromedriver.exe");
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }

     protected void  closeApplication(){
         driver.quit();
     }
}

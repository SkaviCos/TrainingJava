package ru;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Litecart {
    FirefoxDriver wd;
    //ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        //wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void Litecart() {
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F%3Fapp%3Dappearance%26doc%3Dlogotype");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("\\undefined");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.linkText("Template")).click();
        wd.findElement(By.linkText("Logotype")).click();
        wd.findElement(By.linkText("Catalog")).click();
        wd.findElement(By.linkText("Product Groups")).click();
        wd.findElement(By.linkText("Option Groups")).click();
        wd.findElement(By.linkText("Manufacturers")).click();
        wd.findElement(By.linkText("Suppliers")).click();
        wd.findElement(By.linkText("Delivery Statuses")).click();
        wd.findElement(By.linkText("Sold Out Statuses")).click();
        wd.findElement(By.linkText("Quantity Units")).click();
        wd.findElement(By.linkText("CSV Import/Export")).click();
        wd.findElement(By.linkText("Countries")).click();
        wd.findElement(By.linkText("Currencies")).click();
        wd.findElement(By.linkText("Customers")).click();
        wd.findElement(By.linkText("CSV Import/Export")).click();
        wd.findElement(By.linkText("Newsletter")).click();
        wd.findElement(By.linkText("Geo Zones")).click();
        wd.findElement(By.linkText("Languages")).click();
        wd.findElement(By.linkText("Storage Encoding")).click();
        wd.findElement(By.linkText("Modules")).click();
        wd.findElement(By.linkText("Customer")).click();
        wd.findElement(By.linkText("Shipping")).click();
        wd.findElement(By.linkText("Payment")).click();
        wd.findElement(By.linkText("Order Total")).click();
        wd.findElement(By.linkText("Order Success")).click();
        wd.findElement(By.linkText("Order Action")).click();
        wd.findElement(By.linkText("Orders")).click();
        wd.findElement(By.linkText("Order Statuses")).click();
        wd.findElement(By.linkText("Pages")).click();
        wd.findElement(By.linkText("Reports")).click();
        wd.findElement(By.linkText("Monthly Sales")).click();
        wd.findElement(By.linkText("Most Sold Products")).click();
        wd.findElement(By.linkText("Most Shopping Customers")).click();
        wd.findElement(By.linkText("Settings")).click();
        wd.findElement(By.linkText("Defaults")).click();
        wd.findElement(By.linkText("General")).click();
        wd.findElement(By.linkText("Listings")).click();
        wd.findElement(By.linkText("Images")).click();
        wd.findElement(By.linkText("Checkout")).click();
        wd.findElement(By.linkText("Advanced")).click();
        wd.findElement(By.linkText("Security")).click();
        wd.findElement(By.linkText("Slides")).click();
        wd.findElement(By.linkText("Tax")).click();
        wd.findElement(By.linkText("Tax Classes")).click();
        wd.findElement(By.linkText("Tax Rates")).click();
        wd.findElement(By.linkText("Translations")).click();
        wd.findElement(By.linkText("Scan Files")).click();
        wd.findElement(By.linkText("CSV Import/Export")).click();
        wd.findElement(By.linkText("Users")).click();
        wd.findElement(By.linkText("vQmods")).click();
        wd.findElement(By.xpath("//li[@id='doc-vqmods']//span[.='vQmods']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

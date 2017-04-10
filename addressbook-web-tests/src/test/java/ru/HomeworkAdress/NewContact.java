package ru.HomeworkAdress;

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

public class NewContact {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void testNewContact() {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.linkText("add new")).click();
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).sendKeys("Test1");
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).sendKeys("Test2");
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).sendKeys("Ska");
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).sendKeys("Yandex");
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).sendKeys("+74952655648");
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
        wd.findElement(By.xpath("//div/div[3]/ul/li[2]/a")).click();
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

package ru.TrainingJava.addressbook;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {



    @Test
    public void DeleteGroup() {
        //wd.get("http://localhost/addressbook/");
        //wd.findElement(By.name("pass")).click();
        //wd.findElement(By.name("pass")).clear();
        //wd.findElement(By.name("pass")).sendKeys("secret");
        //wd.findElement(By.name("user")).click();
        //wd.findElement(By.name("user")).clear();
        //wd.findElement(By.name("user")).sendKeys("admin");
        //wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        //wd.findElement(By.linkText("groups")).click();
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }


}


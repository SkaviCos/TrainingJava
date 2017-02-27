package ru.TrainingJava.addressbook;


import org.testng.annotations.Test;



public class FirstSeleniumTest extends TestBase {

    @Test
    public void testFirstSeleniumTest() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("New", "test1", "test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}

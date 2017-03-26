package ru.TrainingJava.addressbook.tests;


import org.testng.annotations.Test;
import ru.TrainingJava.addressbook.model.GroupData;


public class FirstSeleniumTest extends TestBase {

    @Test
    public void testFirstSeleniumTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("New", "test1", "test2"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}

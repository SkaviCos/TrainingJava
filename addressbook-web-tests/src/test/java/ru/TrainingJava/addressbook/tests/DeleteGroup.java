package ru.TrainingJava.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {



    @Test
    public void DeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }


}


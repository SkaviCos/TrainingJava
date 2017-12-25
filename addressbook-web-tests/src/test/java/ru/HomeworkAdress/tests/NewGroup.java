package ru.HomeworkAdress.tests;


import org.testng.annotations.Test;
import ru.HomeworkAdress.model.GroupData;

public class NewGroup extends TestBaseGroup {

    @Test
    public void testNewGroup() {
        app.goToGroupPage();
        app.initGroupForm();
        app.fillGroupForm(new GroupData("NewGroup", "1", "1"));
        app.submitGroup();
        app.returnToGroupPage();
        app.goToGroupPage();
    }

}



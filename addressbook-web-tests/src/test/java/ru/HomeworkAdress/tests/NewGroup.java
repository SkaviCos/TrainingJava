package ru.HomeworkAdress.tests;


import org.testng.annotations.Test;
import ru.HomeworkAdress.GroupData;
import ru.HomeworkAdress.TestBaseGroup;

public class NewGroup extends TestBaseGroup {

    @Test
    public void testNewGroup() {
        goToGroupPage();
        initGroupForm();
        fillGroupForm(new GroupData("NewGroup", "1", "1"));
        submitGroup();
        returnToGroupPage();
        goToGroupPage();
    }

}



package ru.HomeworkAdress.tests;

import org.testng.annotations.Test;

import ru.HomeworkAdress.TestBaseGroup;

public class DeleteGroup extends TestBaseGroup {

    @Test
    public void testDeleteGroup() {
        goToGroupPage();
        selectGroup();
        deleteSelectGroup();
        returnToGroupPage();
    }
}

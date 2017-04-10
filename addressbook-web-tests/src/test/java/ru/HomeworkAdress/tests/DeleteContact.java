package ru.HomeworkAdress.tests;

import org.testng.annotations.Test;
import ru.HomeworkAdress.TestBaseContact;

public class DeleteContact extends TestBaseContact {


    @Test
    public void testDeleteContact() {

        selectContact();
        deleteSelectContact();
        returnToContactPage();
    }


}


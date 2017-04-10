package ru.HomeworkAdress.tests;

import org.testng.annotations.Test;
import ru.HomeworkAdress.ContactData;
import ru.HomeworkAdress.TestBaseContact;

public class NewContact extends TestBaseContact {

    @Test
    public void testNewContact() {
        goToContactPage();
        fillContactForm(new ContactData("Test1", "Test2", "Ska", "Yandex", "+74952655648"));
        submitContact();
        returnToContactPage();
    }

}

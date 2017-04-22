package ru.HomeworkAdress.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.HomeworkAdress.appmanager.ApplicationsManager;

public class TestBaseGroup {

    protected final ApplicationsManager app = new ApplicationsManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


    public ApplicationsManager getApp() {
        return app;
    }
}

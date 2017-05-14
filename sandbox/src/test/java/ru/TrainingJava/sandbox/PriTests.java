package ru.TrainingJava.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Константин on 06.05.2017.
 */
public class PriTests {

    @Test
    public void testPri(){
        Assert.assertTrue(Pri.isPri(42));
    }
}

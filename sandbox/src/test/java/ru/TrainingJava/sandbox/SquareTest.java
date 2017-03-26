package ru.TrainingJava.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
    @Test
    public void testArea() {

        Square s = new Square(5);
        //assert s.area() != 26; passed
        //Assert.assertEquals(25, s.area()); failed, because 25  isn`t double number
        Assert.assertEquals(25.0, s.area());
    }


}

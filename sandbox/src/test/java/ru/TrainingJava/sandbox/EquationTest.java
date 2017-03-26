package ru.TrainingJava.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Константин on 26.03.2017.
 */
public class EquationTest {

    @Test
    public void testEquation0() {

        Equation e = new Equation(1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0);

    }

    public void testEquation1() {

        Equation e = new Equation(1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1);

    }

    public void testEquation2() {

        Equation e = new Equation(1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);

    }

}

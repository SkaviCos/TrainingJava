package ru.TrainingJava.Homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.TrainingJava.Homework.Point.distance;

/**
 * Created by Константин on 27.03.2017.
 */
public class PointDistTest {

    @Test

    public void PointDist0() {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(0.0, 0.0);
        Assert.assertEquals(distance(p1, p2), 0.0);


    }

    @Test

    public void PointDist1() {
        Point p1 = new Point(12.0, 0.0);
        Point p2 = new Point(0.0, 32.0);
        assert Point.distance(p1, p2) != 0.0;
    }

    @Test

    public void PointDist2() {
        Point p1 = new Point(20.0, 10.0);
        Point p2 = new Point(60.0, 40.0);
        Assert.assertEquals(Point.distance(p1, p2), 50.0);

    }

}

package ru.TrainingJava.Homework;


public class HomeworkMain {
    public void main(String[] args) {

        Point p1 = new Point(5, 8);
        Point p2 = new Point(12, 9);

        System.out.println("Расстояние между точками: p1(" + p1.x + ", " + p1.y + ") and p2(" + p2.x + ", " + p2.y + ") = " + Point.distance(p1, p2));

    }
}

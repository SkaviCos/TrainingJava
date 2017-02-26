package ru.TrainingJava.sandbox;

public class Main {
  public static void main(String[] args) {

    Square s = new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(8, 9);

    System.out.println("Площадь прямоугольника со сторонами " + r.m + " и " + r.n + " = " + r.area());


   // Point p = new Point(2, 6);

    //System.out.println("Расстояние между двумя точками " + p.p1 + " и " + p.p2 + " = " + Math.sqrt(p.distance()));

  }
}







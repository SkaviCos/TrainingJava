package ru.TrainingJava.sandbox;

public class Main{
  public static void main(String[] args){

  System.out.println("123");

  //int l = 8;
  //int s = l * l;

    Square s =new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));


    Rectangle r = new Rectangle(8,9);

    System.out.println("Площадь прямоугольника со сторонами " + r.m + " и " + r.n +" = " + area(r));
  }




  public static double area(Square s){
    return s.l * s.l;
  }

  public static double area(Rectangle r){
    return r.m * r.n;
  }
}

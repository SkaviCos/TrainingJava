package ru.TrainingJava.sandbox;


public class Rectangle {
    public double m;
    public double n;


    public Rectangle(double m, double n){

        this.m = m;
        this.n = n;

    }


    public  double area(){
        return this.m * this.n;
    }
}


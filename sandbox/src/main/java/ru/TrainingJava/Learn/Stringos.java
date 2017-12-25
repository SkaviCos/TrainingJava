package ru.TrainingJava.Learn;

import java.math.BigInteger;

public class Stringos {
    public static void main(String[] args){
        int j = 0;
        int k = 3;
        int h = 0;
        String ass = new String("987");
        //String[] line = ass.split("");
        //for(int i = 0;i<line.length;i++){
        //    System.out.println(line[]);
        //}
        char[] a = ass.toCharArray();
        System.out.println(a[0]);

        //char[] b = new char[];
        //System.out.println(a);
        //System.out.println(b);
        for(int i = 0; i<a.length; i++){
            System.out.println(a.length);
            j=a[i]*a[i]*a[i];
            //j = (int) Math.pow(a[i], k);
            System.out.println(j);
            //j += (int) Math.pow(a[i + 1], k + 1);

            System.out.println();
        }
        h=j/987;
        System.out.println(h);
        //if(a||b)
        //System.out.println(b);

        /*System.out.println(line[0]);
        int k = 14;
        int n = 3;
        int a  = k / n ;
        System.out.println(a);*/
    }
}

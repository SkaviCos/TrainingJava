package ru.TrainingJava.Learn;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Константин on 10.06.2017.
 */
public class ArrayListToArray {

    public static void main(String[] args) {
        int[] str = {3,4,4,4,5,6,7,8,9,10};
        System.out.println(str.length);
        int[] b=new int[5];
        for(int i = 0;i<b.length;i++){
            b[i]=str[i+5];
            System.out.p     rintln(b[i]);
        }
    }
}
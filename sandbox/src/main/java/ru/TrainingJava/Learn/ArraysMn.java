package ru.TrainingJava.Learn;

/**
 * Created by Константин on 14.05.2017.
 */
public class ArraysMn {
    public static void main(String[] args) {

        int[][][] m = {{{1, 2, 3}}, {{2, 3, 3}}, {{2, 6, 9}}};
        // for(int i = 0; i < m.length;i++) {
        //   for (int j = 0; j < m[i].length; j++) {
        for (int i[][] : m) {
            for (int j = 0;j<i.length;j++) {
                for (int k[] : i)
                    System.out.print(k + " ");
            }
            System.out.println();
        }

        //System.out.println(m[2][2]);

    }
}

package ru.TrainingJava.sandbox;

/**
 * Created by Константин on 06.05.2017.
 */
public class Pri {
    public static boolean isPri(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

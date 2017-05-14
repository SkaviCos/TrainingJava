package ru.TrainingJava.Learn;

public class StringUtils {
    //public static String s = "klklklk";
   // public String f;
    public static String toAlternativeString(String string) {
        //this.s = s;
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}

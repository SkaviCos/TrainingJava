package ru.TrainingJava.Learn;

import static sun.misc.Version.print;

/**
 * Created by Константин on 07.05.2017.
 */
class Rock {
    Rock() {
        System.out.println("Rock");
    }
}

class SimpleConstructor {
    public static void main(String[] args) {
        //for (int i = 0; i < 10; i++) {
          //  new Rock();
        System.out.println(Math.abs(-233));
        }
    }
//}
class Bird{}
class DefConscrt{
    public static void main (String[] args){
        Bird b = new Bird();
    }

}
class Window{
    Window(int maker){
    System.out.print( maker );
    }
    class House{
        Window w1 = new Window(1);
        House(){
            System.out.print("House()");
        }
    }
public static class Immutable{
        public static String upcase(String s){
            return s.toUpperCase();
        }
        public static void main(String[] args){
            String q = "howdy";
            System.out.print(q);
            String qq = upcase(q);

        }
}


}
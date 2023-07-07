package codegym.day_5;

public class StaticExample2 {

    public int number = 1000;
    public static int number2 = 10000;

    public void displayNum() {
        System.out.println(number);
        System.out.println(number2);
    }

    public static void displayNum2() {
//        System.out.println(number);
        System.out.println(number2);
//        displayNum();
    }
}

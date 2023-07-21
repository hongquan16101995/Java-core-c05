package codegym.day_15;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println("Số vừa nhập: " + n);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void m1() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
           a = scanner.nextInt();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int[] ints = new int[2];

        try {
            ints[2] = a;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(ints));
    }
}

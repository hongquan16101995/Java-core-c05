package codegym.day_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTesst {
    public static void main(String[] args) throws IOException {
//        m1();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("menu");
            System.out.println("1.m1");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    m2();
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
            }
        } while (true);
    }

    public static void m1() throws IOException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

        File file = new File("text.txt");
        Files.copy(file.getAbsoluteFile().toPath(), new File("abc").toPath());
    }

    public static void m2() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập id: ");
            int a = scanner.nextInt();
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập giới tính");
            String gender = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

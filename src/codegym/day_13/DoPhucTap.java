package codegym.day_13;

public class DoPhucTap {
    public static void main(String[] args) {
        //độ phức tạp của m1 là 100; tương đương số lần lặp
        //độ phức tạp của phương thức m1 phụ thuộc vào sự biến thiên của vòng lặp
        //độ phức tạp của m1: O(n)
        m1(new int[100]);

        //công thức cộng:
        //trong phương thức m2: 2 vòng lặp
        //vòng lặp 1: O(m)
        //vòng lặp 2: O(n)
        //độ phức tạp của m2: O(m + n)
        m2(new int[10], new int[90]);

        //công thức nhân:
        //trong phương thức m2: 2 vòng lặp
        //vòng lặp 1: O(m)
        //vòng lặp 2: O(n)
        //độ phức tạp của m2: O(m * n)
        m3(new int[10], new int[90]);

        //trong phương thức m2: 2 phương thức
        //m1: O(n)
        //m2: O(m + n)
        //độ phức tạp của m4: O(max(O(n), O(m + n)))
        m4();
    }

    public static void m1(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(i);
        }
    }

    public static void m2(int[] ints, int[] ints1) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < ints1.length; i++) {
            System.out.println(i);
        }
    }

    public static void m3(int[] ints, int[] ints1) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                System.out.println(i);
            }
            System.out.println(i);
        }
    }

    public static void m4() {
        m1(new int[5000]);
        m2(new int[10], new int[90]);
    }
}

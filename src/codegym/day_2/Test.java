package codegym.day_2;

public class Test {
    public static void main(String[] args) {
        int[] ints = new int[]{10, 20, 30};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
            System.out.println(i);
        }

        //for-each
        for (int value : ints) {
            System.out.println(value);
        }
    }
}

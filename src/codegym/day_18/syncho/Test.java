package codegym.day_18.syncho;

public class Test {
    synchronized public void display(String name) {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] < ints[j]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        for (int anInt : ints) {
            System.out.println("Thread " + name + ":" + anInt);
        }
    }
}

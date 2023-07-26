package codegym.day_18;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread2 thread2 = new MyThread2();

        thread.start();
        thread2.start();
    }
}

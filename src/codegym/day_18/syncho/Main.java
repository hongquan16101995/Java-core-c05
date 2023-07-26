package codegym.day_18.syncho;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
        Thread1 thread1 = new Thread1("1");
        thread1.setTest(test);
        Thread2 thread2 = new Thread2("2");
        thread2.setTest(test);

//        thread1.start();
//        thread2.start();

        //tính time bt
        long a = System.currentTimeMillis();
        test.display("B.thuong 1");
        test1.display("B.thuong 2");
        long b = System.currentTimeMillis();
        long c = b - a;

        //tính time đa luồng
        long d = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        long e = System.currentTimeMillis();
        long f = e - d;

        System.out.println("Time bt: " + c);
        System.out.println("Time đa luồng: " + f);
    }
}

package codegym.day_18.syncho;

public class Thread1 extends Thread{

    private Test test;

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        test.display(super.getName());
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}

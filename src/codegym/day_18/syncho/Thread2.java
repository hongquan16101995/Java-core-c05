package codegym.day_18.syncho;

public class Thread2 extends Thread{
    private Test test;

    public Thread2(String name) {
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

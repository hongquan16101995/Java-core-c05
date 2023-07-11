package codegym.day_7.casting;

public class Bird extends Animal{

    @Override
    public void run() {
        System.out.println("Chim di chuyển bằng cách bay");
    }

    public void hasLong() {
        System.out.println("Chim có lông");
    }
}

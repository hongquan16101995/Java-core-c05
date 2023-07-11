package codegym.day_7;

public class Plain extends Vehicle implements Fly{
    @Override
    public void howToFly() {
        System.out.println("Máy bay bay bằng cánh và động cơ");
    }

    @Override
    public void move() {
        System.out.println("Di chuyển nhanh trên trời");
    }
}

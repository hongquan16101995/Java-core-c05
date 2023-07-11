package codegym.day_7;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Car toyota = new Car();
        Plain boeing = new Plain();
        //khả năng bay
        bird.howToFly();
        boeing.howToFly();
        //khả năng di chuyển
        toyota.move();
        boeing.move();
    }
}

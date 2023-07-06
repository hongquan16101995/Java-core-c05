package codegym.day_4;

public class Car {
    public int a; //giá trị mặc định là 0
    private int wheel = 4;

    public Car() {}

    public Car(int wheel) {
        this.wheel = wheel;
    }

    public int getWheel() {
        return this.wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void m1() {

    }
}

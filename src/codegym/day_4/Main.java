package codegym.day_4;

public class Main {
    public static void main(String[] args) {
        // let car = new Car()
        // mỗi 1 lớp được tạo ra trong Java
        // đều là 1 kiểu dữ liệu mới
        int a = 10;
        Car car = new Car();
        System.out.println(car.getWheel());
        car.setWheel(18);
        System.out.println(car.getWheel());
    }

    public static void m1() {
        System.out.println("Hello");
    }
}

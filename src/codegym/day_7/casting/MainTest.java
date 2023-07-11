package codegym.day_7.casting;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal foggy = new Foggy();
        Animal snake = new Snake();
        animal.run();
        bird.run();
        foggy.run();
        snake.run();

        //casting
        //down-casting: kỹ thuật cho phép ép kiểu 1 biến từ kdl cha về kdl con
        //yêu cầu: kdl thực tế của biến phải là kiểu con, nếu không sẽ phát sinh lỗi
        //sử dụng toán tử instance of để check kdl của biến trước khi ép
        //down casting còn được gọi là ép kiểu tường minh, khai báo rõ ràng ép kiểu
        Bird birdCasting = (Bird) bird;
        birdCasting.hasLong();

        if (animal instanceof Bird) {
            Bird birdCasting2 = (Bird) animal;
            birdCasting2.hasLong();
        } else {
            System.out.println("Không ép được");
        }

        //up-casting: kỹ thuật cho phép khai báo 1 biến thuộc kiểu cha
        //kdl thực tế là kiểu con
        //upcasting được gọi khác là ép kiểu ngầm định, không cần khai báo ép kiểu
        Bird bird1 = new Bird();
        Animal animal1 = (Animal) bird1;

        //để có thể ép kiểu, KDL khai báo và KDL thực tế phải thuộc cùng 1 cây kế thừa
        //1 trong 1 KDL phải là IS-A của KDL còn lại
    }
}

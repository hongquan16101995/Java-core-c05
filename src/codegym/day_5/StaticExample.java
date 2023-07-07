package codegym.day_5;

public class StaticExample {

    public int number = 9999;
    //thành phần static là thành phần của lớp
    //cho phép truy đến thành phần static thông qua tên lớp
    //mà không cần khởi tạo đối tượng
    //LƯU Ý: STATIC VẪN CHỊU ẢNH HƯỞNG CỦA ACCESS MODIFIER
    public static int num = 1111;

    public static void main(String[] args) {
//        StaticExample staticExample = new StaticExample();
//        System.out.println(staticExample.number);

        StaticExample object1 = new StaticExample();
        StaticExample object2 = new StaticExample();
        StaticExample object3 = new StaticExample();
        System.out.println("Static = " + object1.num);
        System.out.println("Static = " + object2.num);
        System.out.println("Static = " + object3.num);
        System.out.println("Không static = " + object1.number);
        System.out.println("Không static = " +object2.number);
        System.out.println("Không static = " +object3.number);

        object2.num = 2222;
        object2.number = 2222;

        System.out.println("Static = " + object1.num);
        System.out.println("Static = " + object2.num);
        System.out.println("Static = " + object3.num);
        System.out.println("Không static = " +object1.number);
        System.out.println("Không static = " +object2.number);
        System.out.println("Không static = " +object3.number);
//        System.out.println(StaticExample.num);

        StaticExample.display();
    }

    public static void display() {
        System.out.println("HelloWorld");
    }
}

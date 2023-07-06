package codegym.day_4;

public class Demo {
    //overload: là kỹ thuật nạp chồng phuơng thức
    //cho phép khai báo nhiều phương thức cùng tên gọi
    //tuy nhiên sẽ có thể hiện khác nhau dựa vào việc thay tham số của phương thức

    // khác kiểu dữ liệu
    // khác số lượng tham số
    // khác về vị trí kiểu dữ liệu tham số

    //xử lý bài tập StopWatch: System.currentTimeMillis(): kdl = long
    //1 ngày = 24h = 24*60p = 24*60*60s = 24*60*60*1000ms = 86400000ms

    public static void m1(int number) {
        System.out.println(number);
    }

    public static void m1(String num) {
        System.out.println(num);
    }

    public static void m1(int number, int num) {
        System.out.println(num + "; " + number);
    }

    public static void m1(int a, String b) {
        System.out.println(b);
    }

    public static void m1(String b, int a) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1( 200);
        m1("100");
        m1(10, 200);
        m1("100", 200);
        m1(1000, "2000");
        System.out.println(System.currentTimeMillis());
    }
}

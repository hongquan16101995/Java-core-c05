package codegym.day_5;

public class MainStatic {

    //block static: khối static; thành phần khởi chạy trực tiếp, trước cả main
    //khối static sẽ không tính trong tiến trình của chương trình
    //tác dụng lớn nhất: khởi tạo các tài nguyên tĩnh trước khi sử dụng trong chương trình

    static {
        System.out.println("ByeWorld");
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}

// khai báo gói (package) chứa lớp của chương trình java
// src là file root
package codegym.day_1;

// khai báo import tài nguyên có sẵn
// trong Java, JDK cung cấp rất nhiều các thư viện có sẵn để phục vụ chương trình
// khai báo này để sử dụng được các thư viện
import java.util.Scanner;

// khai báo lớp
// từ khóa public và class là bắt buộc
// tên lớp trùng với tên file chứa
public class DemoClass {
    // phương thức siêu main: public static void main(String[] agrs)
    // đây là phương thức được gọi đầu tiên khi chương trình java thực thi
    // psvm => phím tab
    // main => phím tab
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}

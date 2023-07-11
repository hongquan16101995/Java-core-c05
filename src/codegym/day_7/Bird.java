package codegym.day_7;

//từ khóa implements: triển khai 1 interface cho 1 concrete class
//trong concrete class cần định nghĩa các phương thức abstract của interface
public class Bird implements Fly{
    @Override
    public void howToFly() {
        System.out.println("Chim bay bằng cánh có lông");
    }
}

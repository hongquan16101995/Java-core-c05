package codegym.day_7.casting;

public class Snake extends Animal{
    @Override
    public void run() {
        System.out.println("Rắn di chuyển bằng cách trườn");
    }

    public void hasTooth() {
        System.out.println("Rắn có răng");
    }
}

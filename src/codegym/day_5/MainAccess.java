package codegym.day_5;

public class MainAccess {
    public static void main(String[] args) {
        Parent parent = new Parent(100,200,300);
        System.out.println(parent.publicNumber);
        System.out.println(parent.defaultNumber);
        System.out.println(parent.getPrivateNumber());
        int publicNumber = 222;
    }
}

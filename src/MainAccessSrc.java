import codegym.day_5.Parent;

public class MainAccessSrc {
    public static void main(String[] args) {
        Parent parent = new Parent(100,200,300);
        System.out.println(parent.publicNumber);
        parent.publicNumber = 2000;
        System.out.println(parent.getPublicNumber());
    }
}

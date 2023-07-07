package codegym.day_5;

public class Parent {
    public int publicNumber;
    int defaultNumber;
    private int privateNumber;

    public Parent() {
    }

    public Parent(int publicNumber, int defaultNumber, int privateNumber) {
        this.publicNumber = publicNumber;
        this.defaultNumber = defaultNumber;
        this.privateNumber = privateNumber;
    }

    public int getPublicNumber() {
        return publicNumber;
    }

    public void setPublicNumber(int publicNumber) {
        this.publicNumber = publicNumber;
    }

    public int getDefaultNumber() {
        return defaultNumber;
    }

    public void setDefaultNumber(int defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    public int getPrivateNumber() {
        return privateNumber;
    }

    public void setPrivateNumber(int privateNumber) {
        this.privateNumber = privateNumber;
    }

    public static void main(String[] args) {
        Parent parent = new Parent(1,2,3);
        System.out.println(parent.privateNumber);
    }
}

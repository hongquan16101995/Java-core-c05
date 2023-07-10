package codegym.day_6;

public class SuperClass {
    public int property_1 = 1;
    protected int property_2 = 2;
    int property_3 = 3;
    private int property_4 = 4;

    public final String name = "C0523G1";

    public SuperClass() {
    }

    public SuperClass(int property_1, int property_2, int property_3, int property_4) {
        this.property_1 = property_1;
        this.property_2 = property_2;
        this.property_3 = property_3;
        this.property_4 = property_4;
    }

    public SuperClass(int property_2) {
        this.property_2 = property_2;
    }

    public int getProperty_1() {
        return property_1;
    }

    public int getProperty_2() {
        return property_2;
    }

    public int getProperty_4() {
        return property_4;
    }

    public void m1() {
        System.out.println("HelloWorld");
    }

    public final void m2() {
        System.out.println("CodeGym");
    }
}

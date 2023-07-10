package test;

import codegym.day_6.SuperClass;

public final class SubClass extends SuperClass {
    public int property_1;
    public int property_5;

    public SubClass() {
        super(5);
    }

    public SubClass(int property_5) {
        super(10);
        this.property_5 = property_5;
    }

    public int getProperty_1() {
        return this.property_1;
    }

    public int getProperty_1Super() {
        return super.getProperty_4();
    }


    //final method trong kế thừa: ngăn chặn ghi đè phương thức
    //ghi đè phương thức - overriding method: các phương thức giữ nguyên tên và tham số,
    //nhưng có phần thân được thay đổi
    //overloading xảy ra trong cùng 1 lớp
    //overriding xảy ra trong quan hệ kế thừa, phương thức lớp cha sang lớp con bị ghi đè
    @Override //annotation đánh dấu đây là 1 method tồn tại ở lớp cha
    public void m1() {
        System.out.println("ByeWorld");
    }

    public static void main(String[] args) {
//        SuperClass superClass = new SuperClass(100);
//        System.out.println(superClass);
//        superClass.m1();
        SubClass subClass = new SubClass();
        System.out.println(subClass.property_2);
        System.out.println(subClass.name);
        subClass.m1();
        subClass.m2();
    }
}

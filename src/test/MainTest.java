package test;

import codegym.day_6.SuperClass;

public class MainTest {
    public static void main(String[] args) {
//        SuperClass superClass = new SuperClass(110);
//        System.out.println(superClass);
        SubClass subClass = new SubClass();
        System.out.println(subClass);
        subClass.m2();
        System.out.println(subClass.getProperty_1());
        System.out.println(subClass.getProperty_1Super());
        System.out.println(subClass.getProperty_2());
    }
}

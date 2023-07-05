package codegym.day_3;

public class Array {
    public static void main(String[] args) {
//        //khai báo literal
//        int[] ints = {1,2,3,4};
//        System.out.println(ints[2]);
//
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println("Vị trí: " + i);
//            System.out.println("Giá trị: " + ints[i]);
//        }
//
//        for (int value : ints) {
//            System.out.println(value);
//        }

//        // khai báo new
//        // tìm hiểu variable local và variable global
//        int[] ints1 = new int[5];
//        // cách khai báo khác vẫn đúng
//        int ints3[] = new int[5];
//
//        System.out.println(ints1.length);
//        System.out.println(ints1[1]);
//
        //khai báo mảng 2 chiều
        int[][] ints2 = new int[5][5];
        for (int i = 0; i < ints2.length; i++) {
            for (int j = 0; j < ints2[i].length; j++) {
                System.out.println("i = " + i + "j = " + j);
            }
        }
//
//        //khác biệt
//        int[] ints3 = {1,2,3,4};
//        //truy xuất phần tử không tồn tại
////        System.out.println(ints3[4]);
////        ints3[4] = 1000;
//        System.out.println(ints3[0]);
    }
}

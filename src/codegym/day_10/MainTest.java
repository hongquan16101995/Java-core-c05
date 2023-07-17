package codegym.day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MainTest {
    public static void main(String[] args) {
        methodArrayList();
//        methodLinkedList();
    }

    public static void methodArrayList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        //thêm vào list
        integerList.add(15);
        //thêm vào đầu list
        integerList.add(0,100);
        integerList.add(0,800);
        integerList.add(0,80);
        System.out.println(integerList);
//        System.out.println(integerList.get(0));
//        integerList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
        Collections.sort(integerList);
        System.out.println(integerList);
    }

    public static void methodLinkedList() {
        LinkedList<Integer> integerList = new LinkedList<>();
        //thêm vào list
        integerList.add(15);
        //thêm vào đầu list
        integerList.add(0,100);
//        integerList.addFirst(100);
        System.out.println(integerList);
        System.out.println(integerList.get(0));
        System.out.println(integerList.getFirst());
    }
}

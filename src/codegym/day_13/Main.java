package codegym.day_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(11);
        integers.add(19);
        integers.add(32);
        integers.add(41);
        integers.add(64);
        integers.add(99);
        Integer integer;
        do {
            System.out.println("Nhập giá trị muốn tìm: ");
            integer = scanner.nextInt();
            System.out.println("Linear - Vị trí phần tử là: " + linearSearch(integers, integer)[0]);
            System.out.println("Linear - Số lần tìm kiếm là: " + linearSearch(integers, integer)[1]);
            System.out.println("Vị trí phần tử là: " + binarySearch(integers, integer)[0]);
            System.out.println("Số lần tìm kiếm là: " + binarySearch(integers, integer)[1]);
        } while (integer != 1000);
    }

    public static int[] linearSearch(List<Integer> integers, Integer value) {
        int[] ints = new int[2];
        ints[0] = -1;
        int count = 0;
        for (int i = 0; i < integers.size(); i++) {
            count++;
            if (integers.get(i).equals(value)) {
                ints[0] = i;
                break;
            }
        }
        ints[1] = count;
        return ints;
    }

    //tư duy xử lý nhị phân: chia đổi cấu trúc cần thao tác
    //xét lại các vị trí đầu cuối để thiết lập vị mới cho phần tử so sánh
    //LƯU Ý: CẤU TRÚC CẦN ĐƯỢC SẮP XẾP TRƯỚC KHI TÌM KIẾM BẰNG NHỊ PHÂN
    public static int[] binarySearch(List<Integer> integers, Integer value) {
        int[] ints = new int[2];
        ints[0] = -1;
        int count = 0;

        //tạo 2 biến chứa vị trí đầu cuối
        int first = 0;
        int last = integers.size() - 1;
        //tạo vị trí tìm kiếm đầu tiên
        int mid = (first + last) / 2;

        for (int i = 0; i < integers.size(); i++) {
            count++;
            //nếu giá trị bằng phần tử ở mid
            if (integers.get(mid).equals(value)) {
                ints[0] = mid;
                break;
                //nếu giá trị lớn hơn phần tử mid
            } else if (integers.get(mid) < value) {
                first = mid + 1;
                mid = (first + last) / 2;
                //nếu giá trị nhỏ hơn phần tử mid
            } else if (integers.get(mid) > value) {
                last = mid - 1;
                mid = (first + last) / 2;
            }
        }

        ints[1] = count;
        return ints;
    }
}

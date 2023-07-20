package codegym.day_14;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] ints = {9,3,2,7,4};
//        bubbleSort(ints);
//        enhanceBubbleSort(ints);
//        selectedSort(ints);
//        insertSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public static void selectedSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int min = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < ints[min]) {
                    min = j;
                }
            }
            swap(ints, i, min);
        }
    }

    public static void insertSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int value = ints[i];
            int j = i - 1;
            while (j >= 0 && ints[j] > value) {
                ints[j + 1] = ints[j];
                j--;
            }
            ints[j + 1] = value;
        }
    }

    public static void bubbleSort(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    swap(ints, j, j + 1);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public static void enhanceBubbleSort(int[] ints) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < ints.length && check; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    swap(ints, j, j + 1);
                } else {
                    check = false;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}

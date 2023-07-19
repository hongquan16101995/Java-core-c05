package codegym.day_10;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(2);
        queue.add(5);
        queue.add(1);
        queue.add(8);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

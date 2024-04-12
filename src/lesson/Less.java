package lesson;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Less {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        queue.offer(3);
        queue.offer(6);
        queue.offer(9);
        queue.offer(35);
        queue.offer(2);
        queue.offer(1);
        queue.offer(39);
        queue.offer(94);
        queue.offer(5);
        queue.offer(8);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
package n1;

import java.util.Random;

public class TestArrayQueue {

    public static void fill(ArrayQueue queue) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(rand.nextInt(100));
        }
    }

    public static void dump(ArrayQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.toString1());
            System.out.println(
                    "size: "+ queue.size()+"\n"
                            + "element[0] = " + queue.element()+ "\n"
                            + "delete element[0]: " + queue.dequeue()+ "\n"
            );
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fill(queue);
        dump(queue);
    }
}
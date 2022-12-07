package n1;

import java.util.Random;

public class TestArrayQueueADT {
    public static void fill(ArrayQueueADT queueADT) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            queueADT.enqueue(queueADT, rand.nextInt(100));
        }
    }

    public static void dump(ArrayQueueADT queueADT) {
        while (!ArrayQueueADT.isEmpty(queueADT)) {
            System.out.println(ArrayQueueADT.toString1(queueADT));
            System.out.println(
                    "size: "+ ArrayQueueADT.size(queueADT)+"\n"
                            + "element[0] = " + ArrayQueueADT.element(queueADT)+ "\n"
                            + "delete element[0]: " + ArrayQueueADT.dequeue(queueADT)+ "\n"
            );
        }
    }
    public static void main(String[] args) {
        ArrayQueueADT queueADT = new ArrayQueueADT();
        fill(queueADT);
        dump(queueADT);
    }

}

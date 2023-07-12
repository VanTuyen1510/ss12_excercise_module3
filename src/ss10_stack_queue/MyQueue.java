package ss10_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.offer(1);

        myQueue.element();
        myQueue.peek();

        myQueue.remove();
        myQueue.poll();


    }
}

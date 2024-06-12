package allQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuee
{
    public static void main(String[] args) {

        // Define capacity of ArrayBlockingQueue
        int capacity = 5;

        // Create object of ArrayBlockingQueue
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

        // Add element to ArrayBlockingQueue
        queue.add(23);
        queue.add(32);
        queue.add(45);
        queue.add(12);

        // Print queue after adding numbers
        System.out.println("After adding numbers queue is ");
        System.out.println(queue);
        boolean response = queue.remove(2);

        // print Queue
        System.out.println("Removal of 2 :" + response);

        // print Queue
        System.out.println("queue contains " + queue);

        // remove all the elements
        queue.clear();

        // print queue
        System.out.println("ArrayBlockingQueue:" + queue);

        // Print head of queue using peek() method
        System.out.println("Head of queue " + queue.peek());
    }
}

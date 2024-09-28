package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /// Basic Queue Practice
        Queue<String> token = new LinkedList<>();
        token.offer("A2A");
        token.offer("B2B");
        token.offer("C2C");
        token.offer("D2E");
        token.offer("E2F");
        //System.out.println(token.peek());
        token.poll();
        //System.out.println(token.peek());
        //System.out.println(token.isEmpty());


        Queue<String> checked = new LinkedList<>();
        checked.offer("A2A");
        checked.offer("B2B");
        checked.offer("C2C");
        checked.offer("D2E");
        checked.offer("E2F");

        //System.out.println("In line: "+checked);

        while(!checked.isEmpty()){
            String checkedToken = checked.poll();
            //System.out.println("Checked: "+checkedToken);
            //System.out.println("Available Token: "+checked.size());
        }

        ///Intermediate Queue Practice

        ///Reversed Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        //System.out.println(queue);
        //reversedQueue(queue);
        //System.out.println(queue);


        ///Priority Queue
        Queue<Double> cgpa = new PriorityQueue<>(Collections.reverseOrder());
        cgpa.offer(2.97);
        cgpa.offer(3.30);
        cgpa.offer(3.17);
        cgpa.offer(3.80);

        while (!cgpa.isEmpty()){
            System.out.println(cgpa.poll()
            );
        }
    }

    // used recursion
    public static void reversedQueue(Queue<Integer> queue){

        // Base case: if the queue is empty, return
        if(queue.isEmpty()){
            return;
        }

        // remove the first element
        int front = queue.poll();

        //recursively return the rest of the queue
        reversedQueue(queue);

        queue.add(front);
    }
}





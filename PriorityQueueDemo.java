import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.offer(10);
         queue.offer(20);
          queue.offer(30);
           queue.offer(40);

           System.out.println("Queue: "+queue);
           System.out.println("Size: "+queue.size());
           System.out.println("Front "+queue.peek());
           System.out.println("Contains 20: "+queue.contains(20));
           System.out.println("Removed: "+queue.poll());
           System.out.println("After poll :"+queue);
           queue.offer(50);
           System.out.println("Updated queue: "+queue);
    }
}

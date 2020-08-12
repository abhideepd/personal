package Practice;
import java.util.*;
public class xy {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        p.offer(23);
        p.offer(10);
        p.offer(34);
        p.offer(5);
        p.offer(13);
        p.offer(14);
        p.offer(2);
        p.offer(27);
        p.offer(5);

        while(p.size()!=0)
        System.out.println(p.poll());
    }
}
package Prepbytes;
import java.io.*;
import java.util.*;
public class MINCOSROPE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            PriorityQueue<Long> q=new PriorityQueue<Long>();
            for(int i=0; i<size; i++)
            {
                long temp=Long.parseLong(input[i]);
                q.offer(temp);
            }
            if(q.size()==1)
            System.out.println(q.poll());
            else{
                long sum=0;
                while(q.size()>1)
                {
                    System.out.println(q);
                    long min1=q.poll();
                    long min2=q.poll();
                    q.offer(min1+min2);
                    sum=sum+min1+min2;
                }
                System.out.println(sum);
            }            
        }
    }
}
package Prepbytes;
import java.io.*;
import java.util.*;
public class MAXSUB {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input[0]);
        int K=Integer.parseInt(input[1]);
        String input1[]=(x.readLine()).split(" ");
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0; i<size; i++)
        {
            q.add(Integer.parseInt(input1[i]+""));
        }
        while(q.size()!=0)
        {
            Queue temp=new LinkedList<>(q);
            int max=Integer.MIN_VALUE;
            int counter=0;
            if(temp.size()>=K)
            {
                while(counter!=K)
                {
                    int t=(int)temp.remove();
                    if(max<t)
                    max=t;
                    ++counter;
                }
                q.remove();
                System.out.print(max+" ");
            }
            else
            break;
        }
        System.out.println();
    }
}
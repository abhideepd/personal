package Prepbytes;
import java.io.*;
import java.util.*;
public class FIRNONRECHA {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input=x.readLine();
            Queue<Character> q=new LinkedList<Character>();
            int counter=0;
            for(int i=size-1; i>=0; i--)
            {
                //System.out.println(i+" "+input.charAt(i));
                System.out.println(counter+" "+q);

                if(q.size()==0)
                {
                    q.add(input.charAt(i));
                    ++counter;
                    continue;
                }
                if(q.peek()!=input.charAt(i))
                {
                    q.add(input.charAt(i));
                    ++counter;
                }
                else
                {
                    //System.out.println("wdcdw");
                    q.add(q.remove());
                    --counter;
                }
            }
            System.out.println(counter);
            if(counter==0)
            System.out.println(-1);
            else
            System.out.println(q.peek());
        }
    }
}
package Prepbytes;
import java.io.*;
import java.util.*;
public class PSQUARE1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        HashMap<Long, Long> hm=new HashMap<Long, Long>();

        for(int i=1; i<=100000; i++)
        {
            long temp=i*i;
            long t=1;
            hm.put(temp, t);
        }

        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input1[0]);
            int M=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            String input3[]=(x.readLine()).split(" ");

            for(int i=0; i<N; i++)
            {
                int temp1=Integer.parseInt(input2[i]);
                System.out.print(func(hm, temp1, input3)+" ");
            }
            System.out.println();
        }
    }
    public static int func(HashMap<Long, Long> hm, int a, String []b)
    {
        long min=100000000;
        int pos=-1;
        for(int i=0; i<b.length; i++)
        {
            int temp=Integer.parseInt(b[i]);
            long prod=temp*a;
            if(hm.containsKey(prod))
            {
                if(min>temp)
                {
                    min=temp;
                    pos=i+1;
                }
            }
        }
        return pos;
    }
}
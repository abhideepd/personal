package Prepbytes;
import java.io.*;
import java.util.*;
public class PSQUARE1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        HashMap<Long, Long> hm=new HashMap<Long, Long>();

        for(long i=1; i<=100005; i++)
        {
            long temp=i*i;
            long t=1;
            hm.put(temp, t);
        }
//System.out.println(hm);
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input1[0]);
            int M=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            String input3[]=(x.readLine()).split(" ");

            TreeMap<Integer, Integer> B=new TreeMap<Integer, Integer>();
            for(int i=0; i<M; i++)
            {
                B.put(Integer.parseInt(input3[i]), 0);
            }
            //System.out.println(B);
            for(int i=0; i<N; i++)
            {
                int temp1=Integer.parseInt(input2[i]);
                long temp=temp1;
                if(hm.containsKey(temp))
                System.out.print(func(hm, B)+" ");
                else
                System.out.print(func(hm, temp1, B)+" ");
            }
            System.out.println();
        }
    }
    public static int func(HashMap<Long, Long> hm, int a, TreeMap<Integer, Integer> B)
    {
        for (Map.Entry mapElement : B.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            long prod=a*key;
            if(hm.containsKey(prod))
            return key;
        }
        return -1;
    }
    public static int func(HashMap<Long, Long> hm, TreeMap<Integer, Integer> B)
    {
        for (Map.Entry mapElement : B.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            long temp=key;
            if(hm.containsKey(temp))
            return key;
        }
        return -1;
    }
}
package Project_Euler;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem23 {
    static HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
    static int limit=100;    //28123

    public static void main(String[] args) throws IOException {
        //input();
        fact();
        long sum=0; 
        System.out.println(arr);
        for(Entry<Integer, Integer> m:arr.entrySet())
        {
            sum=sum+(int)m.getKey();
        }
        System.out.println(sum);
    }

    static void fact() {
        //for (Entry<Integer, Integer> m : arr.entrySet())
        for(int ii=1; ii<=limit; ii++)
        {
            //int temp=(int)m.getKey();
            int temp=ii;
            int fact_sum=0;
            for(int i=1; i<=(temp/2)+1; i++)
            {
                if(temp%i==0)
                fact_sum=fact_sum+i;
            }
            //System.out.println(temp+" "+fact_sum);
            if(fact_sum<=temp)
            arr.put(temp, 0);
        }
    }
    static void input()
    {
        for(int i=1; i<=28123; i++)
        {
            arr.put(i, 0);
        }
        fact();
    }
}

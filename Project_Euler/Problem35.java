package Project_Euler;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Problem35 
{
    static HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
    static int limit=1000000;
    static int l=1000000;
    public static void main(String []args)
    {
        //testing();
        for(int i=2; i<=limit; i++)
        hm.put(i, 0);

        prime();
        int k=1;
        int ans=0;
        for(Entry<Integer, Integer> m:hm.entrySet())
        {
            int temp=m.getKey();
            System.out.print("k:"+k+" ");
            if(temp>l)break;
            if(circular_prime(temp))
            {
                ++ans;
                System.out.print(" "+temp+" val:"+ans);
            }
            
            System.out.println();
        }

        System.out.println("\nAnswer: "+ans);
    }    
    static boolean circular_prime(int x)
    {
        int n=0;
        while(x!=0)
        {
            n=n*10+(x%10);
            x=x/10;
        }
        if(hm.containsKey(n))
        {
            System.out.print(n+" ");
            return true;
        }
        return false;
    }
    static void prime()
    {
        for(int i=2; i<=limit; i++)
        {
            int j=2;
            if(i*j>limit)
            break;
            while(i*j<=limit)
            {
                hm.remove(i*j);
                ++j;
            }
        }
    }
}

package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem45 
{
    static HashMap<Long, Integer> Tn=new HashMap<Long, Integer>();
    static HashMap<Long, Integer> Pn=new HashMap<Long, Integer>();
    static HashMap<Long, Integer> Hn=new HashMap<Long, Integer>();
    public static void main(String []args)throws IOException
    {
        generate_nos();       
        find_common();
    }    
    static void find_common()
    {
        long ans=0;
        int flag=0;
        for(Map.Entry<Long, Integer> m:Tn.entrySet())
        {
            long Tn=(long)m.getKey();
            if((Pn.containsKey(Tn))&&(Hn.containsKey(Tn)))
            {ans=Tn;++flag;}
            if(flag==3)
            break;
        }
        System.out.println("Answer: "+ans);
    }
    static void generate_nos()
    {
        generate_T_series();
        generate_P_series();      
        generate_H_series();
    }
    static void generate_T_series()
    {
        long x=0;
        int k=1;
        while(x>=0)
        {
            x=T(k++);
            Tn.put(x, 0);
        }
    }
    static void generate_P_series()
    {
        long x=0;
        int k=1;
        while(x>=0)
        {
            x=P(k++);
            Pn.put(x, 0);
        }
    }
    static void generate_H_series()
    {
        long x=0;
        int k=1;
        while(x>=0)
        {
            x=H(k++);
            Hn.put(x, 0);
        }
    }
    static long T(int n)
    {
        long temp=n*(n+1)/2;
        return temp;
    }
    static long P(int n)
    {
        long temp=n*((3*n)-1)/2;
        return temp;
    }
    static long H(int n)
    {
        long temp=n*((2*n)-1);
        return temp;
    }
}

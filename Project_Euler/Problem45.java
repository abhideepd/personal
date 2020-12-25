package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem45 
{
    static HashMap<Long, Integer> Tn=new HashMap<Long, Integer>();
    static HashMap<Long, Integer> Pn=new HashMap<Long, Integer>();
    static HashMap<Long, Integer> Hn=new HashMap<Long, Integer>();
    static int limit=50000*3;
    static long mod=1;
    public static void main(String []args)throws IOException
    {
        generate_nos();       
        find_common();
        //testing1();
    }    
    static void testing1()
    {
        //System.out.println("Size: "+Tn.size()+" "+Pn.size()+" "+Hn.size());
        //System.out.println(Tn);
        System.out.println(T(131071));
    }
    static void find_common()
    {
        long ans1=0, ans2=0;
        int flag=0;
        for(Map.Entry<Long, Integer> m:Tn.entrySet())
        {
            long Tn=(long)m.getKey();
            int Tn_value=(int)m.getValue();
            if((Pn.containsKey(Tn))&&(Hn.containsKey(Tn)))
            {
                ans1=Tn;
                ++flag;
                ans2=Tn_value;
            }
            if(flag==3)
            break;
        }
        System.out.println("Answer: "+ans1+" "+ans2);
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
        while(k<=limit)
        {
            x=T(k);
            Tn.put(x, k);
            ++k;
        }
    }
    static void generate_P_series()
    {
        long x=0;
        int k=1;
        while(k<=limit)
        {
            x=P(k);
            Pn.put(x, k);
            ++k;
        }
    }
    static void generate_H_series()
    {
        long x=0;
        int k=1;
        while(k<=limit)
        {
            x=H(k);
            Hn.put(x, k);
            ++k;
        }
    }
    static long T(long n)
    {
        long temp=((((n)*(n+1))) / 2);
        return temp;
    }
    static long P(long n)
    {
        long temp=((n)*(((3*n))-1))/2;
        return temp;
    }
    static long H(long n)
    {
        long temp=(n)*(((2*n))-1);
        return temp;
    }
}

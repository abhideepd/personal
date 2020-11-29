package Codeforces;
import java.io.*;
public class prob14 {
    static int ti[];
    static int zi[];
    static int yi[];
    static int ith_assistant[];
    static int m;
    static int n;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String nm[]=(x.readLine()).split(" ");
        m=Integer.parseInt(nm[0]);
        n=Integer.parseInt(nm[1]);
        ti=new int[n];
        zi=new int[n];
        yi=new int[n];
        ith_assistant=new int[n];

        for(int i=0; i<n; i++)
        {
            String temp[]=(x.readLine()).split(" ");
            int temp_ti=Integer.parseInt(temp[0]);
            int temp_zi=Integer.parseInt(temp[1]);
            int temp_yi=Integer.parseInt(temp[2]);
            ti[i]=temp_ti;
            zi[i]=temp_zi;
            yi[i]=temp_yi;
        }

        int l=1, r=Integer.MAX_VALUE;

        if(m==0)
        print(0);

        else
        {
            while(l<=r)
            {
                int a=r+((l-r)/2);      //-- binary search on time

                /*testing*/ System.out.println("l:"+l+" r:"+r+" a:"+a);

                if(f(a)==1)
                r=a-1;
                else
                l=a+1;
            }
            int garbage=f(114200);
            print(l);
        }
    }
    static int f(int x)
    {
        long ans=0;

        for(int i=0; i<n; i++)
        {
            int temp_ans=0;
            int zw=(ti[i]*zi[i])+yi[i];
            int no_of_balloons=x/zw;
            int no_of_remainder_balloons=0;
            int Rm=x%zw;

            if(Rm>=(ti[i]*zi[i]))
            {
                no_of_remainder_balloons=zi[i];
            }
            else
            {
                no_of_remainder_balloons=Rm/ti[i];
            }

            temp_ans=no_of_balloons+no_of_remainder_balloons;
            ith_assistant[i]=temp_ans;

            ans=ans+temp_ans;
        }

        /*testing*/ System.out.println("ans:"+ans+" x:"+x+" m:"+m);

        if(ans>m)
        {
            int i=n;
            int diff=(int)ans-m;
            while(--i>=0)
            {
                if(ith_assistant[i]>diff)
                {
                    ith_assistant[i]=ith_assistant[i]-diff;
                    break;
                }
            }
        }

        if(ans>=m)
        return 1;
        else
        return 0;
    }
    static void print(int x)
    {
        System.out.println(x);

        for(int i:ith_assistant)
        System.out.print(i+" ");

        System.out.println();
    }
}

package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem38 
{
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    static int limit=987654321;
    public static void main(String []args)throws IOException
    {
        //testing1();
        largest_pan_digital_no();
    }
    static void testing1()
    {
        //System.out.println(join(200, 300));
    }
    static void largest_pan_digital_no()
    {
        long max=0;
        for(int i=1; i<=10000; i++)
        {
            long no=i;
            int j=2;
            while(length(no)<9)
            {
                no=join(no, i*j);
                ++j;
            }
            if(check(no))
            {
                if(max<no)
                max=no;
            }
        }
        System.out.println("Answer: "+max);
    }
    static long join(long no, long x)
    {
        int n=length(x);
        no = no * (int)Math.pow(10, n) + x ;
        return no;
    }
    static boolean check(long x)
    {
        if(x>limit)
        return false;

        boolean choice[]=new boolean[9];
        while(x!=0)
        {
            int temp=(int)x%10;

            if(temp==0)
            return false;

            if(choice[temp-1]==true)
            return false;

            x=x/10;

            choice[temp-1]=true;
        }
        for(boolean i:choice)
        {
            if(i==false)
            return false;
        }
        return true;
    }
    static int length(long x)
    {
        int ans=0;
        while(x!=0)
        {
            ++ans;
            x=x/10;
        }
        return ans;
    }
}
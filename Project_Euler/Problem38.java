package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem38 
{
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        //testing1();
        testing2();
    }
    static void testing2()
    {
        generate_nos();
        System.out.println(arr);
    }
    static void testing1()
    {
        int n=join(111, 2);
        System.out.println(n);
    }
    static void generate_nos()
    {
        int i=1;
        while(length(i*2)<10)
        {
            int temp=i;
            int k=2;
            while(length(temp)<5)
            {
                temp=join(temp, temp*k);
                ++k;
            }
            //if(check(temp))
            arr.add(temp);
            ++i;
        }
    }
    static boolean check(int z)
    {
        boolean no[]=new boolean[9];
        while(z!=0)
        {            
            int temp=z%10;

            //System.out.println(temp+" "+z);

            if(temp==0)
            return false;

            if(no[temp-1]==true)
            return false;

            z=z/10;
        }
        for(boolean i:no)
        {
            if(i==false)
            return false;
        }
        return true;
    }
    static int join(int no, int join)
    {
        int t=(int)(Math.log(join)/Math.log(10))+1;
        int prod=(int)Math.pow(10, t);
        int n=no*prod+join;
        return n;
    }
    static int length(int x)
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

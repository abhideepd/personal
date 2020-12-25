package Testing;
import java.io.*;
import java.util.*;
public class permutation 
{
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    static int no_arr[]={1, 2, 3, 4, 5, 6, 7, 8 ,9};
    //static int no_arr[]={1, 2, 3};
    static boolean choice[];
    static int s=0;
    static int n;
    public static void main(String []args)
    {
        n=no_arr.length;
        choice=new boolean[no_arr.length];
        func();
        System.out.println(arr);
    }    
    static void func()
    {
        if(length(s)==n)
        {
            arr.add(s);
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                if(choice[i]==true)
                continue;
                choice[i]=true;
                int temp=s;
                s=s*10+no_arr[i];
                func();
                s=temp;
                choice[i]=false;
                //func(i+1);
            }
        }
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

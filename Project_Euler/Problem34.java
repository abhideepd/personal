package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem34 
{
    static int arr[];
    static int limit=1000000000;
    public static void main(String []args)throws IOException
    {
        arr=new int[10];
        arr[0]=1;
        generate_fact();
        long ans=0;

        for(int i=10; i<=limit; i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                sum=sum+arr[n%10];
                n=n/10;
                if(sum>i)
                break;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
                ans=ans+i;
            }
        }
        System.out.println("Answer: "+ans);
    }    
    static void generate_fact()
    {
        for(int i=1; i<10; i++)
        arr[i]=arr[i-1]*i;

        //print();
    }
    static void print()
    {
        for(int i : arr)
        System.out.print(i+" ");
    }
}

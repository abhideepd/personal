package Project_Euler;
import java.io.*;
public class Problem12 {

    static int max_size=10000;
    public static void main(String []args)
    {
        int arr[]=new int[max_size];
        //arr[1]=1;
        //arr[2]=2;
        //arr[3]=2;

        for(int i=1; i<max_size; i++)
        {
            int j=1;
            while(j*i<max_size)
            {
                j=j*i;
                arr[j]=arr[j]+1;
                //j=j*i;
            }
        }
    }
    static long sum(long n)
    {
        return n*(n+1)/2;
    }
}

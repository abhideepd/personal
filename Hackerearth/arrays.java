package Hackerearth;
import java.io.*;
import java.util.*;
public class arrays {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];

            for(int i=1; i<size; i++)
            arr[i]=Integer.parseInt(input[i]);

            int M=Integer.parseInt(x.readLine());
        }
    }
    static boolean answer(int []arr, int n, int M, int counter)
    {
        if(n<0)
        return false;

        if(n>arr.length)
        return false;

        if(n==(arr.length-1))
        {
            if(counter==M)
            return true;
            else
            return false;
        }

        return answer(arr, n+arr[n], M, counter+1)||answer(arr, n-arr[n], M, counter+1);
    }
}

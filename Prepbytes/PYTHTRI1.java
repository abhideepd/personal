package Prepbytes;
import java.io.*;
import java.util.*;
public class PYTHTRI1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        while(T-->0)
        {
            int N=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[N];
            for(int i=0; i<N; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            boolean result=false;
            for(int i=N-1; i>=0; i--)
            {
                int l=0, r=i-1;
                long temp=arr[i];
                result=check(arr, l, r, temp*temp);
                if(result)
                break;
            }
            if(result)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
    static boolean check(int []arr, int l, int r, long X)
    {
        while(l<r)
        {
            long temp1=arr[l];
            long temp2=arr[r];
            long sum=temp1*temp1+temp2*temp2;

            if(sum<X)
            ++l;

            else if(sum>X)
            --r;

            else
            return true;
        }
        return false;
    }
}
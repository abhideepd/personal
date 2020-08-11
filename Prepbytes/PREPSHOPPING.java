package Prepbytes;
import java.io.*;
import java.util.*;
public class PREPSHOPPING {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T;i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int K=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size;i++)
            {
                arr[i]=Integer.parseInt(input2[i]);
            }
            Arrays.sort(arr);
            System.out.println(out(arr, K));
        }
    }
    static int out(int []arr, int K)
    {
        int sum=arr[0], ans=0;
        for(int i=1; i<arr.length; i++)
        {
            if(sum>K)
            return ans;

            else if(sum==K)
            return ++ans;

            if(arr[i-1]!=arr[i])
            {
                sum=sum+arr[i];
                ++ans;
            }
        }
        return ++ans;
    }
}

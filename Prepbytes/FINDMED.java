package Prepbytes;
import java.io.*;
public class FINDMED {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int n_size=Integer.parseInt(input1[0]);
            int m_size=Integer.parseInt(input1[1]);
            String input_n[]=(x.readLine()).split(" ");
            String input_m[]=(x.readLine()).split(" ");
            int arr[]=new int[100001];
            for(int i=0; i<n_size; i++)
            {
                int temp=Integer.parseInt(input_n[i]);
                arr[temp]=arr[temp]+1;
            }
            for(int i=0; i<m_size; i++)
            {
                int temp=Integer.parseInt(input_m[i]);
                arr[temp]=arr[temp]+1;
            }
            int sum=n_size+m_size;
            if(sum%2==0)
            {
                int a=sum/2;
                int b=a+1;
                System.out.println(median(arr, a, b));
            }
            else{
                int a=(sum-1)/2;
                System.out.println(median(arr, a+1));
            }
        }
    }
    static double median(int []arr, int a, int b)
    {
        int sum=0, flag=0;
        double result=0;
        for(int i=0; i<100001; i++)
        {
            sum=sum+arr[i];
            if((sum>=a)&&(flag==0))
            {
                result=result+i;
                flag=1;
            }
            if(sum>=b)
            {
                result=result+i;
                break;
            }
        }
        return result/2;
    }
    static int median(int []arr, int a)
    {
        int sum=0, result=0;
        for(int i=0; i<100001; i++)
        {
            sum=sum+arr[i];
            if(sum>=a)
            {
                result=i;
                break;
            }
        }
        return result;
    }
}
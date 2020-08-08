package Prepbytes;
import java.io.*;
public class INDKEY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[N];
            for(int i=0; i<N; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            int K=Integer.parseInt(x.readLine());
            System.out.println(ans(arr, K));
        }
    }
        static String ans(int []arr, int K)
        {
            int N=arr.length;
            int l=0, r=N-1;
            
            while(l<r)
            {
                int sum=arr[l]+arr[r];
                if(sum==K)
                return l+" "+r;
                else if(sum<K)
                ++l;
                else
                --r;
            }
            return "no answer";
        }
    }

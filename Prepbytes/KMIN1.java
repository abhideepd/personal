package Prepbytes;
import java.io.*;
public class KMIN1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int sieve[]=new int[100001];
        int k=1;
        for(int i=1; i<100001; i++)
        sieve[i]=sieve[i-1]+k++;

        //for(int i=1; i<50; i++)
        //System.out.print(sieve[i]+" ");

        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input[0]);
            int K=Integer.parseInt(input[1]);
            String input_arr[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            int sum_arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input_arr[i]);
                if(i==0)
                sum_arr[i]=arr[i];
                else
                sum_arr[i]=sum_arr[i-1]+arr[i];

                //System.out.print(sum_arr[i]+" ");
            }
            int ans=sieve[size], prev=0;
            //System.out.println(ans);
            for(int i=0; i<size; i++)
            {
                if(arr[i]>=K)
                continue;

                for(int j=i; j<size; j++)
                {
                    int temp=sum_arr[j]-prev;
                    if(temp<K)
                    --ans;
                    else
                    break;
                }
                prev=sum_arr[i];
            }
            System.out.println(ans);
        }   
    }
}
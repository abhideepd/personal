package Prepbytes;
import java.io.*;
import java.util.*;
public class SUMPO {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        //Sieve
        int arr[]=new int[1000001];
        ArrayList<Long> prime=new ArrayList<Long>();
        arr[0]=1;
        arr[1]=1;
        for(int i=0; i<1000001; i++)
        {
            if(arr[i]==0)
            {
                for(int i1=2; i1<arr.length; i1++)
                {
                    int prod=i*i1;
                    if(prod>=arr.length)
                    break;
                    arr[prod]=1;
                }
            }
        }
        for(int i=0; i<1000001; i++)
        {
            if(arr[i]==0)
            {
                if(xyz(i)==1)
                arr[i]=1;
            }
        }
        long result=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                result=result+i;
                prime.add(result);
            }
        }
        //  System.out.println(prime);
        for(int i=0;i<T; i++)
        {
            int N=Integer.parseInt(x.readLine());
            System.out.println(prime.get(N-1));
        }
    }
    static void printt(int []arr)
    {
        for(int i=0; i<500; i++)
        {
            if(arr[i]==0)
            System.out.println(i);
        }
    }
    static int xyz(int a)
    {
        while(a!=0)
        {
            int temp=a%10;
            if((temp==3)||(temp==5)||(temp==7))
            return 1;
            a=a/10;
        }
        return 0;
    }
}
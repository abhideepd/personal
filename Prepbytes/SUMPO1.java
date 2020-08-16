package Prepbytes;
import java.io.*;
public class SUMPO1 {
    public static void main(String[] args)throws IOException{      
        //sieve
        int size=1000000;
        boolean sve[]=new boolean[size+1];
        sve[0]=true;
        sve[1]=true;
        for(int i=2; i<size+1; i++)
        {
            if(sve[i]==false)
            {
                for(int j=i*2; j<size+1; j=j+i)
                {
                    sve[j]=true;
                }
            }
        }
        for(int i=3; i<size+1; i++)
        {
            if(sve[i]==false)
            sve[i]=check(i);
        }
        int k=0;
        for(int i=0; i<size+1; i++)
        {
            if(sve[i]==false)
           ++k;
        }
        System.out.println(k);
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            long sum=0;
            k=0;
            while(N>0)
            {
                if(sve[k]==false)
                {
                    sum=sum+k;
                    --N;
                }
                ++k;
            }
            System.out.println(sum);
        }
    }
    static boolean check(int a)
    {
        while(a!=0)
        {
            int temp=a%10;
            if((temp==3)||(temp==5)||(temp==7))
            return true;
            a=a/10;
        }
        return false;
    }
}
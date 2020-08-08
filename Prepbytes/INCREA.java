package Prepbytes;
import java.io.*;
public class INCREA {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            int i=N;
            for(; i>=0; i--)
            {
                if(check(i))
                break;
            }
            System.out.println(i);
        }
    }
    static boolean check(int a)
    {
        int prev=a%10;
        a=a/10;
        while(a!=0)
        {
            int temp=a%10;
            if(prev<temp)
            return false;
            prev=temp;
            a=a/10;
        }
        return true;
    }
}
package Prepbytes;
import java.io.*;
public class MAXSET {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int Q=Integer.parseInt(x.readLine());
        for(int i=0; i<Q; i++)
        {
            String input[]=(x.readLine()).split(" ");
            long L=Long.parseLong(input[0]);
            long R=Long.parseLong(input[1]);

            long ans=-1, res=-1;
            while(L++<=R)
            {
                long temp=count(L);
                if(temp>ans)
                {
                    ans=temp;
                    res=L;
                }
            }
            System.out.println(res);
        }
    }
    static long count(long a)
    {
        long cnt=0;
        while(a!=0)
        {
            ++cnt;
            a=a&(a-1);
        }
        return cnt;
    }
}
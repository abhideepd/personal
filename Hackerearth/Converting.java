package Hackerearth;
import java.io.*;
public class Converting {
    static long ans=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long a=Long.parseLong(input[0]);
            long b=Long.parseLong(input[1]);
            long c=Long.parseLong(input[2]);
            long temp=no(a, b, c);
            System.out.println(temp);
        }
    }
    public static long no(long a, long b, long c)
    {
        if(a==b)
        {
            //ans=t;
            return 0;
        }
        else if(a>b)
        {
            return (((a-b)/2)+((a-b)%2));
        }
        else if((b%c)==0)
        {
            return 1+no(a, b/c, c);
        }
        else
        {
            long temp=((b/c)+1)*c;
            return (temp-b)/2+(temp-b)%2+no(a, temp, c);
        }
    }
}

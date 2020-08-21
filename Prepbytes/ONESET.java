package Prepbytes;
import java.io.*;
public class ONESET {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        long L=Long.parseLong(input[0]);
        long R=Long.parseLong(input[1]);
        long ans=0;
        for(long i=L; i<=R; i++)
        {
            ans=ans+count(i);
        }
        System.out.println(ans);
    }
    static long count(long a)
    {
        if(a==2)
        return 1;
        long aa=a;
        double temp1=Math.log10(aa);
        double temp2=Math.log10(2);
        int digits=(int)(Math.ceil(temp1/temp2));
        long two=(long)Math.pow(2, digits);
        two=two-1;
        long diff=two-a;
        //System.out.println(a+" ---> "+diff);
        for(int i=1; i<=diff; i=i*2)
        {
            if(i==diff)
            return 1;
        }
       return 0;
    }
}
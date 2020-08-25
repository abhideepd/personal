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
            //System.out.println(i+" "+count(i));
        }
        System.out.println(ans);
    }
    static long count(long a)
    {
        if(a==2)
        return 1;
        if(a==1)
        return 0;
        if(a==0)
        return 1;

        //long a=23;
        int digits=(int)(Math.ceil((Math.log10(a))/Math.log10(2)));
        long num=(long)Math.pow(2, digits)-1;
        //System.out.println(num+" "+a+"----"+(num^a));
        long temp=num-a;
        if(temp==0)
        return 0;
        if((temp&(temp-1))==0)
        return 1;
        else
        return 0;
    }
}
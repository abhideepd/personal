package Prepbytes;
import java.io.*;
public class MLOFDGT {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        long m=(long)Math.pow(10, 9)+7;
        for(int i=0; i<T; i++)
        {
            Long input=Long.parseLong(x.readLine());
            System.out.println((multi(input))%m);
        }
    }
    static long multi(long input)
    {
        //System.out.println(ans);
        if(input/10==0)
        return input;
        return input%10*multi(input/10);
    }
}
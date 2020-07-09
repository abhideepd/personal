package Prepbytes;
import java.io.*;
public class DETPRIME {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int num=Integer.parseInt(x.readLine());
            
            System.out.println(prime(num));
        }
    }
    static String prime(int num)
    {
        int n=(int)Math.sqrt(num);
        for(int i=2; i<=n; i++)
        {
            if(num%i==0)
            return "No";
        }
        return "Yes";
    }
}
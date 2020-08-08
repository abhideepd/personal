package Prepbytes;
import java.io.*;
public class LOVELETTER {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int size=input.length();
            int limit=size/2;
            int ans=0;
            for(int i=0; i<limit; i++)
            {
                int a=input.charAt(i);
                int b=input.charAt(size-i-1);
                ans=ans+(int)Math.abs(a-b);
            }   
            System.out.println(ans);
        }
    }
}
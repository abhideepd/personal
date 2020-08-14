package Prepbytes;
import java.io.*;
public class RMBNUM1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long r=Long.parseLong(input[0]);
            long p=Long.parseLong(input[1]);
            long q=Long.parseLong(input[2]);

            long ans=0;
            
            System.out.println(ans);
        }
    }
}
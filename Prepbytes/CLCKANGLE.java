package Prepbytes;
import java.io.*;
public class CLCKANGLE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int hrs=Integer.parseInt(input[0]);
            int mins=Integer.parseInt(input[1]);

            int min_=mins/5;
            int ans=(int)Math.abs(min_-hrs)*15;

            System.out.println(ans);
        }
    }
}
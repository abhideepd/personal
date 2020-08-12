package Prepbytes;
import java.io.*;
public class BOXTOY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        int sum=0;
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int t=Integer.parseInt(input[0]);
            int c=Integer.parseInt(input[1]);
            if(c-t>=2)
            ++sum;
        }
        System.out.println(sum);
    }
}
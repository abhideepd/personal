package Prepbytes;
import java.io.*;
public class PGAME {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        long a=Long.parseLong(input[0]);
        long b=Long.parseLong(input[1]);
        long diff=(long)Math.abs(a-b);
        if(diff<=1)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}
package Prepbytes;
import java.io.*;
public class SUBSTRING1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input[]=(x.readLine()).split(" ");
            String s=input[0];
            String t=input[1];
            int n=s.indexOf(t);
            System.out.println(n!=-1?"YES":"NO");
        }
    }
}
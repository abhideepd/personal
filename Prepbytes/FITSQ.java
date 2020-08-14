package Prepbytes;
import java.io.*;
public class FITSQ {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input[]=(x.readLine()).split(" ");
            int M=Integer.parseInt(input[0]);
            int N=Integer.parseInt(input[1]);
            int prod=M*N;
            System.out.println(prod/2);
        }
    }
}
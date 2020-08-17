package Prepbytes;
import java.io.*;
public class PRIMNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        long no=(long)Math.pow(10, N);
        System.out.println(no);
    }
}
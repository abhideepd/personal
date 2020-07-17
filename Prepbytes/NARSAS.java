package Prepbytes;
import java.io.*;
public class NARSAS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int A=Integer.parseInt(input[0]);
        int B=Integer.parseInt(input[1]);
        int K=Integer.parseInt(input[2]);
        int X=Integer.parseInt(input[3]);
        int Y=Integer.parseInt(input[4]);
        int result=(B+(K*Y)-A)/(X+Y);
        if((A+(result*X))==(B+(K-result)*Y))
        System.out.println(result);
        else
        System.out.println(-1);
    }
}
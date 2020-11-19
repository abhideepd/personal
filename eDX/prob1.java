package eDX;
import java.io.*;
public class prob1 {
    public static void main(String args[])throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        int A=Integer.parseInt(inp[0]);
        int B=Integer.parseInt(inp[1]);
        System.out.println(A+B);
    }
}

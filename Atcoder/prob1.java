package Atcoder;
import java.io.*;
public class prob1 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        String input2[]=(x.readLine()).split(" ");
        int a=Integer.parseInt(input1[0]);
        int b=Integer.parseInt(input1[1]);
        int c=Integer.parseInt(input2[0]);
        int d=Integer.parseInt(input2[1]);

        System.out.println((a*d)-(b*c));
    }
}

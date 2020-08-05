package Prepbytes;
import java.io.*;
public class FRACTION1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        double a=Integer.parseInt(input[0]);
        double b=Integer.parseInt(input[1]);
        double result=a/b;
        int a1=(int)a;
        int b1=(int)b;
        int whole=a1/b1;
        double decimal=result-whole;
        String s=decimal+"";
        int len=s.length();
        if(s.length()>14)
        len=14;
        s=s.substring(2, len);
        System.out.println(s);
        len=s.length();
        String res=s;

        for(int i=len/2; i>0; i++)
        {
           // if()
        }
    }
}
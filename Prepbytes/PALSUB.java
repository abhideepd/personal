package Prepbytes;
import java.io.*;
import java.util.*;
public class PALSUB {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input=x.readLine();
            System.out.println(naswer(input));
        }
    }
    static String naswer(String a)
    {
        if(a.length()==1)
        return a;

        for(int i=1; i<=a.length(); i++)
        {
            //return a;
        }
        return a;
    }
}

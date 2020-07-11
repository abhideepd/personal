package Prepbytes;
import java.util.*;
import java.io.*;
public class COMCODE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input=x.readLine();
            System.out.println(fact(input));
        }
    }
    static int fact(String input)
    {
        Stack<String> s=new Stack<String>();
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i)=='>')
            {
                if(s.isEmpty())
                return i;
                else
                s.pop();
            }
            else{
                s.push("<");
            }
        }
        //System.out.println(s);
        if(!s.isEmpty())
        return 0;
        return input.length();
    }
}
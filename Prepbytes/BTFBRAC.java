package Prepbytes;
import java.io.*;
import java.util.*;
public class BTFBRAC {
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
        Stack<Integer> s=new Stack<Integer>();
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
                s.push(i+1);
            }
        }
        ArrayList<Integer> ar=new ArrayList<Integer>(s);
        //System.out.println(s);
        if(!s.isEmpty())
        return ar.get(0)-1;
        return input.length();
    }
}
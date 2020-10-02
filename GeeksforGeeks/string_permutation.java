package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class string_permutation {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input=x.readLine();
            fuckthisbitch(input, "");
            System.out.println();
        }
    }
    static void fuckthisbitch(String a, String res)
    {
        if(a.length()==1)
        {
            System.out.print(res+a+" ");
            return;
        }
        for(int i=0; i<a.length(); i++)
        {
            String temp=a.substring(0, i)+a.substring(i+1, a.length());
            fuckthisbitch(temp, res+a.charAt(i));
        }
    }
}

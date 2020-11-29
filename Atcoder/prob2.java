package Atcoder;
import java.io.*;
public class prob2 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(inp[0]);
        int X=Integer.parseInt(inp[1]);
        String quiz=(x.readLine());

        for(int i=0; i<quiz.length(); i++)
        {
            char temp=quiz.charAt(i);
            if(temp=='o')
            ++X;
            else
            --X;
            X=Math.max(X, 0);
        }
        System.out.println(X);
    }    
}

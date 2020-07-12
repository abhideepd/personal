package Prepbytes;
import java.io.*;
import java.util.*;
public class BTFBRAC {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i>0;i++)
        {
            String input=x.readLine();
            if(input.charAt(0)=='-')
            break;
            System.out.println(i+". "+fact(input));
        }
        
    }
    static int fact(String input)
    {
        Stack<String> s=new Stack<String>();
        int close_b=0;

        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i)=='}')
            {
                if(!(s.isEmpty()))
                s.pop();
                else
                ++close_b;
            }
            else{
                s.push("{");
            }
        }
        int open_b=s.size();
        close_b=close_b+(close_b%2);
        close_b=close_b/2;
        open_b=open_b+(open_b%2);
        open_b=open_b/2;
        return (close_b+open_b);
    }
}
package Prepbytes;
import java.io.*;
import java.util.*;
public class VAPAR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            System.out.println(check(input)?"Valid":"Not Valid");
        }
    }
    static boolean check(String a)
    {
        Stack<String> s=new Stack<String>();
        for(int i=0; i<a.length(); i++)
        {
            char temp=a.charAt(i);
            String temp1=a.charAt(i)+"";
            if((temp=='[')||(temp=='{')||(temp=='('))
            s.push(temp1);
            else if(s.size()==0)
            return false;
            else if(temp==']')
            {
                if(s.peek().equals("["))
                s.pop();
                else
                return false;
            }
            else if(temp=='}')
            {
                if(s.peek().equals("{"))
                s.pop();
                else
                return false;
            }
            else if(temp==')')
            {
                if(s.peek().equals("("))
                s.pop();
                else
                return false;
            }
        }
        if(s.size()==0)
        return true;
        return false;
    }
}